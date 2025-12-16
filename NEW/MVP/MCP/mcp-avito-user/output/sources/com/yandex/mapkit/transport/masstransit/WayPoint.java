package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class WayPoint implements Serializable {
    private String context;
    private boolean context__is_initialized;
    private NativeObject nativeObject;
    private Point position;
    private boolean position__is_initialized;
    private Point selectedArrivalPoint;
    private boolean selectedArrivalPoint__is_initialized;
    private Point selectedDeparturePoint;
    private boolean selectedDeparturePoint__is_initialized;

    public WayPoint() {
        this.position__is_initialized = false;
        this.selectedArrivalPoint__is_initialized = false;
        this.selectedDeparturePoint__is_initialized = false;
        this.context__is_initialized = false;
    }

    private native String getContext__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::WayPoint";
    }

    private native Point getPosition__Native();

    private native Point getSelectedArrivalPoint__Native();

    private native Point getSelectedDeparturePoint__Native();

    private native NativeObject init(Point point, Point point2, Point point3, String str);

    @P
    public synchronized String getContext() {
        try {
            if (!this.context__is_initialized) {
                this.context = getContext__Native();
                this.context__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.context;
    }

    @N
    public synchronized Point getPosition() {
        try {
            if (!this.position__is_initialized) {
                this.position = getPosition__Native();
                this.position__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.position;
    }

    @P
    public synchronized Point getSelectedArrivalPoint() {
        try {
            if (!this.selectedArrivalPoint__is_initialized) {
                this.selectedArrivalPoint = getSelectedArrivalPoint__Native();
                this.selectedArrivalPoint__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.selectedArrivalPoint;
    }

    @P
    public synchronized Point getSelectedDeparturePoint() {
        try {
            if (!this.selectedDeparturePoint__is_initialized) {
                this.selectedDeparturePoint = getSelectedDeparturePoint__Native();
                this.selectedDeparturePoint__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.selectedDeparturePoint;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getPosition(), false, (Class<Archive>) Point.class);
            archive.add((Archive) getSelectedArrivalPoint(), true, (Class<Archive>) Point.class);
            archive.add((Archive) getSelectedDeparturePoint(), true, (Class<Archive>) Point.class);
            archive.add(getContext(), true);
            return;
        }
        this.position = (Point) archive.add((Archive) this.position, false, (Class<Archive>) Point.class);
        this.position__is_initialized = true;
        this.selectedArrivalPoint = (Point) archive.add((Archive) this.selectedArrivalPoint, true, (Class<Archive>) Point.class);
        this.selectedArrivalPoint__is_initialized = true;
        this.selectedDeparturePoint = (Point) archive.add((Archive) this.selectedDeparturePoint, true, (Class<Archive>) Point.class);
        this.selectedDeparturePoint__is_initialized = true;
        String strAdd = archive.add(this.context, true);
        this.context = strAdd;
        this.context__is_initialized = true;
        this.nativeObject = init(this.position, this.selectedArrivalPoint, this.selectedDeparturePoint, strAdd);
    }

    public WayPoint(@N Point point, @P Point point2, @P Point point3, @P String str) {
        this.position__is_initialized = false;
        this.selectedArrivalPoint__is_initialized = false;
        this.selectedDeparturePoint__is_initialized = false;
        this.context__is_initialized = false;
        if (point != null) {
            this.nativeObject = init(point, point2, point3, str);
            this.position = point;
            this.position__is_initialized = true;
            this.selectedArrivalPoint = point2;
            this.selectedArrivalPoint__is_initialized = true;
            this.selectedDeparturePoint = point3;
            this.selectedDeparturePoint__is_initialized = true;
            this.context = str;
            this.context__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"position\" cannot be null");
    }

    private WayPoint(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.selectedArrivalPoint__is_initialized = false;
        this.selectedDeparturePoint__is_initialized = false;
        this.context__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
