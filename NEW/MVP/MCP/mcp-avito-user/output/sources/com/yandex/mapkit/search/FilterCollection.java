package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.ListHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import j.N;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class FilterCollection implements Serializable {
    private List<String> booleanFilters;
    private boolean booleanFilters__is_initialized;
    private Map<String, DateRange> dateFilters;
    private boolean dateFilters__is_initialized;
    private Map<String, List<String>> enumFilters;
    private boolean enumFilters__is_initialized;
    private NativeObject nativeObject;
    private Map<String, NumberRange> rangeFilters;
    private boolean rangeFilters__is_initialized;

    public FilterCollection() {
        this.booleanFilters__is_initialized = false;
        this.enumFilters__is_initialized = false;
        this.rangeFilters__is_initialized = false;
        this.dateFilters__is_initialized = false;
    }

    private native List<String> getBooleanFilters__Native();

    private native Map<String, DateRange> getDateFilters__Native();

    private native Map<String, List<String>> getEnumFilters__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::FilterCollection";
    }

    private native Map<String, NumberRange> getRangeFilters__Native();

    private native NativeObject init(List<String> list, Map<String, List<String>> map, Map<String, NumberRange> map2, Map<String, DateRange> map3);

    @N
    public synchronized List<String> getBooleanFilters() {
        try {
            if (!this.booleanFilters__is_initialized) {
                this.booleanFilters = getBooleanFilters__Native();
                this.booleanFilters__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.booleanFilters;
    }

    @N
    public synchronized Map<String, DateRange> getDateFilters() {
        try {
            if (!this.dateFilters__is_initialized) {
                this.dateFilters = getDateFilters__Native();
                this.dateFilters__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.dateFilters;
    }

    @N
    public synchronized Map<String, List<String>> getEnumFilters() {
        try {
            if (!this.enumFilters__is_initialized) {
                this.enumFilters = getEnumFilters__Native();
                this.enumFilters__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.enumFilters;
    }

    @N
    public synchronized Map<String, NumberRange> getRangeFilters() {
        try {
            if (!this.rangeFilters__is_initialized) {
                this.rangeFilters = getRangeFilters__Native();
                this.rangeFilters__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.rangeFilters;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getBooleanFilters(), false, (ArchivingHandler) new StringHandler());
            archive.add(getEnumFilters(), false, new StringHandler(), new ListHandler(new StringHandler()));
            archive.add(getRangeFilters(), false, new StringHandler(), new ClassHandler(NumberRange.class));
            archive.add(getDateFilters(), false, new StringHandler(), new ClassHandler(DateRange.class));
            return;
        }
        this.booleanFilters = archive.add((List) this.booleanFilters, false, (ArchivingHandler) new StringHandler());
        this.booleanFilters__is_initialized = true;
        this.enumFilters = archive.add(this.enumFilters, false, new StringHandler(), new ListHandler(new StringHandler()));
        this.enumFilters__is_initialized = true;
        this.rangeFilters = archive.add(this.rangeFilters, false, new StringHandler(), new ClassHandler(NumberRange.class));
        this.rangeFilters__is_initialized = true;
        Map<String, DateRange> mapAdd = archive.add(this.dateFilters, false, new StringHandler(), new ClassHandler(DateRange.class));
        this.dateFilters = mapAdd;
        this.dateFilters__is_initialized = true;
        this.nativeObject = init(this.booleanFilters, this.enumFilters, this.rangeFilters, mapAdd);
    }

    public static class NumberRange implements Serializable {
        private double from;

        /* renamed from: to, reason: collision with root package name */
        private double f377467to;

        public NumberRange(double d12, double d13) {
            this.from = d12;
            this.f377467to = d13;
        }

        public double getFrom() {
            return this.from;
        }

        public double getTo() {
            return this.f377467to;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.from = archive.add(this.from);
            this.f377467to = archive.add(this.f377467to);
        }

        public NumberRange() {
        }
    }

    public static class DateRange implements Serializable {
        private String from;

        /* renamed from: to, reason: collision with root package name */
        private String f377466to;

        public DateRange(@N String str, @N String str2) {
            if (str == null) {
                throw new IllegalArgumentException("Required field \"from\" cannot be null");
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Required field \"to\" cannot be null");
            }
            this.from = str;
            this.f377466to = str2;
        }

        @N
        public String getFrom() {
            return this.from;
        }

        @N
        public String getTo() {
            return this.f377466to;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.from = archive.add(this.from, false);
            this.f377466to = archive.add(this.f377466to, false);
        }

        public DateRange() {
        }
    }

    public FilterCollection(@N List<String> list, @N Map<String, List<String>> map, @N Map<String, NumberRange> map2, @N Map<String, DateRange> map3) {
        this.booleanFilters__is_initialized = false;
        this.enumFilters__is_initialized = false;
        this.rangeFilters__is_initialized = false;
        this.dateFilters__is_initialized = false;
        if (list == null) {
            throw new IllegalArgumentException("Required field \"booleanFilters\" cannot be null");
        }
        if (map == null) {
            throw new IllegalArgumentException("Required field \"enumFilters\" cannot be null");
        }
        if (map2 == null) {
            throw new IllegalArgumentException("Required field \"rangeFilters\" cannot be null");
        }
        if (map3 != null) {
            this.nativeObject = init(list, map, map2, map3);
            this.booleanFilters = list;
            this.booleanFilters__is_initialized = true;
            this.enumFilters = map;
            this.enumFilters__is_initialized = true;
            this.rangeFilters = map2;
            this.rangeFilters__is_initialized = true;
            this.dateFilters = map3;
            this.dateFilters__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"dateFilters\" cannot be null");
    }

    private FilterCollection(NativeObject nativeObject) {
        this.booleanFilters__is_initialized = false;
        this.enumFilters__is_initialized = false;
        this.rangeFilters__is_initialized = false;
        this.dateFilters__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
