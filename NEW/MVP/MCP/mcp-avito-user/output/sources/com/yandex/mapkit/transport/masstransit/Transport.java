package com.yandex.mapkit.transport.masstransit;

import AK.c;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public class Transport implements Serializable {
    private Line line;
    private boolean line__is_initialized;
    private NativeObject nativeObject;
    private List<TransportContour> transportContours;
    private boolean transportContours__is_initialized;
    private List<TransportThread> transports;
    private boolean transports__is_initialized;

    public Transport() {
        this.line__is_initialized = false;
        this.transports__is_initialized = false;
        this.transportContours__is_initialized = false;
    }

    private native Line getLine__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Transport";
    }

    private native List<TransportContour> getTransportContours__Native();

    private native List<TransportThread> getTransports__Native();

    private native NativeObject init(Line line, List<TransportThread> list, List<TransportContour> list2);

    @N
    public synchronized Line getLine() {
        try {
            if (!this.line__is_initialized) {
                this.line = getLine__Native();
                this.line__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.line;
    }

    @N
    public synchronized List<TransportContour> getTransportContours() {
        try {
            if (!this.transportContours__is_initialized) {
                this.transportContours = getTransportContours__Native();
                this.transportContours__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.transportContours;
    }

    @N
    public synchronized List<TransportThread> getTransports() {
        try {
            if (!this.transports__is_initialized) {
                this.transports = getTransports__Native();
                this.transports__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.transports;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getLine(), false, (Class<Archive>) Line.class);
            archive.add((List) getTransports(), false, (ArchivingHandler) new ClassHandler(TransportThread.class));
            c.z(TransportContour.class, archive, getTransportContours(), false);
            return;
        }
        this.line = (Line) archive.add((Archive) this.line, false, (Class<Archive>) Line.class);
        this.line__is_initialized = true;
        this.transports = c.x(TransportThread.class, archive, this.transports, false);
        this.transports__is_initialized = true;
        List<TransportContour> listX = c.x(TransportContour.class, archive, this.transportContours, false);
        this.transportContours = listX;
        this.transportContours__is_initialized = true;
        this.nativeObject = init(this.line, this.transports, listX);
    }

    public Transport(@N Line line, @N List<TransportThread> list, @N List<TransportContour> list2) {
        this.line__is_initialized = false;
        this.transports__is_initialized = false;
        this.transportContours__is_initialized = false;
        if (line == null) {
            throw new IllegalArgumentException("Required field \"line\" cannot be null");
        }
        if (list == null) {
            throw new IllegalArgumentException("Required field \"transports\" cannot be null");
        }
        if (list2 != null) {
            this.nativeObject = init(line, list, list2);
            this.line = line;
            this.line__is_initialized = true;
            this.transports = list;
            this.transports__is_initialized = true;
            this.transportContours = list2;
            this.transportContours__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"transportContours\" cannot be null");
    }

    public static class TransportThread implements Serializable {
        private List<TransportThreadAlert> alerts;
        private boolean alerts__is_initialized;
        private Stop alternateDepartureStop;
        private boolean alternateDepartureStop__is_initialized;
        private BoardingOptions boardingOptions;
        private boolean boardingOptions__is_initialized;
        private boolean isRecommended;
        private boolean isRecommended__is_initialized;
        private NativeObject nativeObject;
        private Thread thread;
        private boolean thread__is_initialized;

        public TransportThread() {
            this.thread__is_initialized = false;
            this.isRecommended__is_initialized = false;
            this.alerts__is_initialized = false;
            this.alternateDepartureStop__is_initialized = false;
            this.boardingOptions__is_initialized = false;
        }

        private native List<TransportThreadAlert> getAlerts__Native();

        private native Stop getAlternateDepartureStop__Native();

        private native BoardingOptions getBoardingOptions__Native();

        private native boolean getIsRecommended__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::transport::masstransit::Transport::TransportThread";
        }

        private native Thread getThread__Native();

        private native NativeObject init(Thread thread, boolean z12, List<TransportThreadAlert> list, Stop stop, BoardingOptions boardingOptions);

        @N
        public synchronized List<TransportThreadAlert> getAlerts() {
            try {
                if (!this.alerts__is_initialized) {
                    this.alerts = getAlerts__Native();
                    this.alerts__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.alerts;
        }

        @P
        public synchronized Stop getAlternateDepartureStop() {
            try {
                if (!this.alternateDepartureStop__is_initialized) {
                    this.alternateDepartureStop = getAlternateDepartureStop__Native();
                    this.alternateDepartureStop__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.alternateDepartureStop;
        }

        @P
        public synchronized BoardingOptions getBoardingOptions() {
            try {
                if (!this.boardingOptions__is_initialized) {
                    this.boardingOptions = getBoardingOptions__Native();
                    this.boardingOptions__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.boardingOptions;
        }

        public synchronized boolean getIsRecommended() {
            try {
                if (!this.isRecommended__is_initialized) {
                    this.isRecommended = getIsRecommended__Native();
                    this.isRecommended__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.isRecommended;
        }

        @N
        public synchronized Thread getThread() {
            try {
                if (!this.thread__is_initialized) {
                    this.thread = getThread__Native();
                    this.thread__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.thread;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add((Archive) getThread(), false, (Class<Archive>) Thread.class);
                archive.add(getIsRecommended());
                archive.add((List) getAlerts(), false, (ArchivingHandler) new ClassHandler(TransportThreadAlert.class));
                archive.add((Archive) getAlternateDepartureStop(), true, (Class<Archive>) Stop.class);
                archive.add((Archive) getBoardingOptions(), true, (Class<Archive>) BoardingOptions.class);
                return;
            }
            this.thread = (Thread) archive.add((Archive) this.thread, false, (Class<Archive>) Thread.class);
            this.thread__is_initialized = true;
            this.isRecommended = archive.add(this.isRecommended);
            this.isRecommended__is_initialized = true;
            this.alerts = c.x(TransportThreadAlert.class, archive, this.alerts, false);
            this.alerts__is_initialized = true;
            this.alternateDepartureStop = (Stop) archive.add((Archive) this.alternateDepartureStop, true, (Class<Archive>) Stop.class);
            this.alternateDepartureStop__is_initialized = true;
            BoardingOptions boardingOptions = (BoardingOptions) archive.add((Archive) this.boardingOptions, true, (Class<Archive>) BoardingOptions.class);
            this.boardingOptions = boardingOptions;
            this.boardingOptions__is_initialized = true;
            this.nativeObject = init(this.thread, this.isRecommended, this.alerts, this.alternateDepartureStop, boardingOptions);
        }

        public TransportThread(@N Thread thread, boolean z12, @N List<TransportThreadAlert> list, @P Stop stop, @P BoardingOptions boardingOptions) {
            this.thread__is_initialized = false;
            this.isRecommended__is_initialized = false;
            this.alerts__is_initialized = false;
            this.alternateDepartureStop__is_initialized = false;
            this.boardingOptions__is_initialized = false;
            if (thread == null) {
                throw new IllegalArgumentException("Required field \"thread\" cannot be null");
            }
            if (list != null) {
                this.nativeObject = init(thread, z12, list, stop, boardingOptions);
                this.thread = thread;
                this.thread__is_initialized = true;
                this.isRecommended = z12;
                this.isRecommended__is_initialized = true;
                this.alerts = list;
                this.alerts__is_initialized = true;
                this.alternateDepartureStop = stop;
                this.alternateDepartureStop__is_initialized = true;
                this.boardingOptions = boardingOptions;
                this.boardingOptions__is_initialized = true;
                return;
            }
            throw new IllegalArgumentException("Required field \"alerts\" cannot be null");
        }

        private TransportThread(NativeObject nativeObject) {
            this.thread__is_initialized = false;
            this.isRecommended__is_initialized = false;
            this.alerts__is_initialized = false;
            this.alternateDepartureStop__is_initialized = false;
            this.boardingOptions__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    private Transport(NativeObject nativeObject) {
        this.line__is_initialized = false;
        this.transports__is_initialized = false;
        this.transportContours__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
