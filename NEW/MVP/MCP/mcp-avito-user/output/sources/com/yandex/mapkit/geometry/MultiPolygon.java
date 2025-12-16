package com.yandex.mapkit.geometry;

import AK.c;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class MultiPolygon implements Serializable {
    private NativeObject nativeObject;
    private List<Polygon> polygons;
    private boolean polygons__is_initialized;

    public MultiPolygon() {
        this.polygons__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::geometry::MultiPolygon";
    }

    private native List<Polygon> getPolygons__Native();

    private native NativeObject init(List<Polygon> list);

    @N
    public synchronized List<Polygon> getPolygons() {
        try {
            if (!this.polygons__is_initialized) {
                this.polygons = getPolygons__Native();
                this.polygons__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.polygons;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            c.z(Polygon.class, archive, getPolygons(), false);
            return;
        }
        List<Polygon> listX = c.x(Polygon.class, archive, this.polygons, false);
        this.polygons = listX;
        this.polygons__is_initialized = true;
        this.nativeObject = init(listX);
    }

    public MultiPolygon(@N List<Polygon> list) {
        this.polygons__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.polygons = list;
            this.polygons__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"polygons\" cannot be null");
    }

    private MultiPolygon(NativeObject nativeObject) {
        this.polygons__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
