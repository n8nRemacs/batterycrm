package com.yandex.mapkit;

import AK.c;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class SpannableString implements Serializable {
    private NativeObject nativeObject;
    private List<Span> spans;
    private boolean spans__is_initialized;
    private String text;
    private boolean text__is_initialized;

    public SpannableString() {
        this.text__is_initialized = false;
        this.spans__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::SpannableString";
    }

    private native List<Span> getSpans__Native();

    private native String getText__Native();

    private native NativeObject init(String str, List<Span> list);

    @N
    public synchronized List<Span> getSpans() {
        try {
            if (!this.spans__is_initialized) {
                this.spans = getSpans__Native();
                this.spans__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.spans;
    }

    @N
    public synchronized String getText() {
        try {
            if (!this.text__is_initialized) {
                this.text = getText__Native();
                this.text__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.text;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getText(), false);
            c.z(Span.class, archive, getSpans(), false);
            return;
        }
        this.text = archive.add(this.text, false);
        this.text__is_initialized = true;
        List<Span> listX = c.x(Span.class, archive, this.spans, false);
        this.spans = listX;
        this.spans__is_initialized = true;
        this.nativeObject = init(this.text, listX);
    }

    public static class Span implements Serializable {
        private int begin;
        private int end;

        public Span(int i12, int i13) {
            this.begin = i12;
            this.end = i13;
        }

        public int getBegin() {
            return this.begin;
        }

        public int getEnd() {
            return this.end;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.begin = archive.add(this.begin);
            this.end = archive.add(this.end);
        }

        public Span() {
        }
    }

    public SpannableString(@N String str, @N List<Span> list) {
        this.text__is_initialized = false;
        this.spans__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"text\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(str, list);
            this.text = str;
            this.text__is_initialized = true;
            this.spans = list;
            this.spans__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"spans\" cannot be null");
    }

    private SpannableString(NativeObject nativeObject) {
        this.text__is_initialized = false;
        this.spans__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
