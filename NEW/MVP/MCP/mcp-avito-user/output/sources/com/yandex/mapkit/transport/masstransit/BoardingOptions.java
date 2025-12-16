package com.yandex.mapkit.transport.masstransit;

import AK.c;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public class BoardingOptions implements Serializable {
    private List<BoardingArea> area;
    private boolean area__is_initialized;
    private NativeObject nativeObject;

    public BoardingOptions() {
        this.area__is_initialized = false;
    }

    private native List<BoardingArea> getArea__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::BoardingOptions";
    }

    private native NativeObject init(List<BoardingArea> list);

    @N
    public synchronized List<BoardingArea> getArea() {
        try {
            if (!this.area__is_initialized) {
                this.area = getArea__Native();
                this.area__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.area;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            c.z(BoardingArea.class, archive, getArea(), false);
            return;
        }
        List<BoardingArea> listX = c.x(BoardingArea.class, archive, this.area, false);
        this.area = listX;
        this.area__is_initialized = true;
        this.nativeObject = init(listX);
    }

    public static class BoardingArea implements Serializable {

        /* renamed from: id, reason: collision with root package name */
        private String f377472id;
        private boolean id__is_initialized;
        private NativeObject nativeObject;

        public BoardingArea() {
            this.id__is_initialized = false;
        }

        private native String getId__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::transport::masstransit::BoardingOptions::BoardingArea";
        }

        private native NativeObject init(String str);

        @P
        public synchronized String getId() {
            try {
                if (!this.id__is_initialized) {
                    this.f377472id = getId__Native();
                    this.id__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f377472id;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add(getId(), true);
                return;
            }
            String strAdd = archive.add(this.f377472id, true);
            this.f377472id = strAdd;
            this.id__is_initialized = true;
            this.nativeObject = init(strAdd);
        }

        public BoardingArea(@P String str) {
            this.id__is_initialized = false;
            this.nativeObject = init(str);
            this.f377472id = str;
            this.id__is_initialized = true;
        }

        private BoardingArea(NativeObject nativeObject) {
            this.id__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public BoardingOptions(@N List<BoardingArea> list) {
        this.area__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.area = list;
            this.area__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"area\" cannot be null");
    }

    private BoardingOptions(NativeObject nativeObject) {
        this.area__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
