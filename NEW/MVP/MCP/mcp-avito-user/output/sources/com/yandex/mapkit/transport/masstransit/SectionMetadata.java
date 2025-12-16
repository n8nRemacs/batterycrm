package com.yandex.mapkit.transport.masstransit;

import AK.c;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public class SectionMetadata implements Serializable {
    private SectionData data;
    private boolean data__is_initialized;
    private TravelEstimation estimation;
    private boolean estimation__is_initialized;
    private int legIndex;
    private boolean legIndex__is_initialized;
    private NativeObject nativeObject;
    private Weight weight;
    private boolean weight__is_initialized;

    public static class SectionData implements Serializable {
        private Fitness fitness;
        private Taxi taxi;
        private Transfer transfer;
        private List<Transport> transports;
        private Wait wait;

        @N
        public static SectionData fromFitness(@N Fitness fitness) {
            if (fitness == null) {
                throw new IllegalArgumentException("Variant value \"fitness\" cannot be null");
            }
            SectionData sectionData = new SectionData();
            sectionData.fitness = fitness;
            return sectionData;
        }

        @N
        public static SectionData fromTaxi(@N Taxi taxi) {
            if (taxi == null) {
                throw new IllegalArgumentException("Variant value \"taxi\" cannot be null");
            }
            SectionData sectionData = new SectionData();
            sectionData.taxi = taxi;
            return sectionData;
        }

        @N
        public static SectionData fromTransfer(@N Transfer transfer) {
            if (transfer == null) {
                throw new IllegalArgumentException("Variant value \"transfer\" cannot be null");
            }
            SectionData sectionData = new SectionData();
            sectionData.transfer = transfer;
            return sectionData;
        }

        @N
        public static SectionData fromTransports(@N List<Transport> list) {
            if (list == null) {
                throw new IllegalArgumentException("Variant value \"transports\" cannot be null");
            }
            SectionData sectionData = new SectionData();
            sectionData.transports = list;
            return sectionData;
        }

        @N
        public static SectionData fromWait(@N Wait wait) {
            if (wait == null) {
                throw new IllegalArgumentException("Variant value \"wait\" cannot be null");
            }
            SectionData sectionData = new SectionData();
            sectionData.wait = wait;
            return sectionData;
        }

        @P
        public Fitness getFitness() {
            return this.fitness;
        }

        @P
        public Taxi getTaxi() {
            return this.taxi;
        }

        @P
        public Transfer getTransfer() {
            return this.transfer;
        }

        @P
        public List<Transport> getTransports() {
            return this.transports;
        }

        @P
        public Wait getWait() {
            return this.wait;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.wait = (Wait) archive.add((Archive) this.wait, true, (Class<Archive>) Wait.class);
            this.fitness = (Fitness) archive.add((Archive) this.fitness, true, (Class<Archive>) Fitness.class);
            this.transfer = (Transfer) archive.add((Archive) this.transfer, true, (Class<Archive>) Transfer.class);
            this.taxi = (Taxi) archive.add((Archive) this.taxi, true, (Class<Archive>) Taxi.class);
            this.transports = c.x(Transport.class, archive, this.transports, true);
        }
    }

    public SectionMetadata() {
        this.weight__is_initialized = false;
        this.data__is_initialized = false;
        this.estimation__is_initialized = false;
        this.legIndex__is_initialized = false;
    }

    private native SectionData getData__Native();

    private native TravelEstimation getEstimation__Native();

    private native int getLegIndex__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::SectionMetadata";
    }

    private native Weight getWeight__Native();

    private native NativeObject init(Weight weight, SectionData sectionData, TravelEstimation travelEstimation, int i12);

    @N
    public synchronized SectionData getData() {
        try {
            if (!this.data__is_initialized) {
                this.data = getData__Native();
                this.data__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.data;
    }

    @P
    public synchronized TravelEstimation getEstimation() {
        try {
            if (!this.estimation__is_initialized) {
                this.estimation = getEstimation__Native();
                this.estimation__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.estimation;
    }

    public synchronized int getLegIndex() {
        try {
            if (!this.legIndex__is_initialized) {
                this.legIndex = getLegIndex__Native();
                this.legIndex__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.legIndex;
    }

    @N
    public synchronized Weight getWeight() {
        try {
            if (!this.weight__is_initialized) {
                this.weight = getWeight__Native();
                this.weight__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.weight;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getWeight(), false, (Class<Archive>) Weight.class);
            archive.add((Archive) getData(), false, (Class<Archive>) SectionData.class);
            archive.add((Archive) getEstimation(), true, (Class<Archive>) TravelEstimation.class);
            archive.add(getLegIndex());
            return;
        }
        this.weight = (Weight) archive.add((Archive) this.weight, false, (Class<Archive>) Weight.class);
        this.weight__is_initialized = true;
        this.data = (SectionData) archive.add((Archive) this.data, false, (Class<Archive>) SectionData.class);
        this.data__is_initialized = true;
        this.estimation = (TravelEstimation) archive.add((Archive) this.estimation, true, (Class<Archive>) TravelEstimation.class);
        this.estimation__is_initialized = true;
        int iAdd = archive.add(this.legIndex);
        this.legIndex = iAdd;
        this.legIndex__is_initialized = true;
        this.nativeObject = init(this.weight, this.data, this.estimation, iAdd);
    }

    public SectionMetadata(@N Weight weight, @N SectionData sectionData, @P TravelEstimation travelEstimation, int i12) {
        this.weight__is_initialized = false;
        this.data__is_initialized = false;
        this.estimation__is_initialized = false;
        this.legIndex__is_initialized = false;
        if (weight == null) {
            throw new IllegalArgumentException("Required field \"weight\" cannot be null");
        }
        if (sectionData != null) {
            this.nativeObject = init(weight, sectionData, travelEstimation, i12);
            this.weight = weight;
            this.weight__is_initialized = true;
            this.data = sectionData;
            this.data__is_initialized = true;
            this.estimation = travelEstimation;
            this.estimation__is_initialized = true;
            this.legIndex = i12;
            this.legIndex__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"data\" cannot be null");
    }

    private SectionMetadata(NativeObject nativeObject) {
        this.weight__is_initialized = false;
        this.data__is_initialized = false;
        this.estimation__is_initialized = false;
        this.legIndex__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
