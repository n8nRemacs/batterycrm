package com.yandex.mapkit;

import AK.c;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public class Image implements Serializable {
    private NativeObject nativeObject;
    private List<ImageSize> sizes;
    private boolean sizes__is_initialized;
    private List<String> tags;
    private boolean tags__is_initialized;
    private String urlTemplate;
    private boolean urlTemplate__is_initialized;

    public Image() {
        this.urlTemplate__is_initialized = false;
        this.sizes__is_initialized = false;
        this.tags__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::Image";
    }

    private native List<ImageSize> getSizes__Native();

    private native List<String> getTags__Native();

    private native String getUrlTemplate__Native();

    private native NativeObject init(String str, List<ImageSize> list, List<String> list2);

    @N
    public synchronized List<ImageSize> getSizes() {
        try {
            if (!this.sizes__is_initialized) {
                this.sizes = getSizes__Native();
                this.sizes__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.sizes;
    }

    @N
    public synchronized List<String> getTags() {
        try {
            if (!this.tags__is_initialized) {
                this.tags = getTags__Native();
                this.tags__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.tags;
    }

    @N
    public synchronized String getUrlTemplate() {
        try {
            if (!this.urlTemplate__is_initialized) {
                this.urlTemplate = getUrlTemplate__Native();
                this.urlTemplate__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.urlTemplate;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getUrlTemplate(), false);
            archive.add((List) getSizes(), false, (ArchivingHandler) new ClassHandler(ImageSize.class));
            archive.add((List) getTags(), false, (ArchivingHandler) new StringHandler());
            return;
        }
        this.urlTemplate = archive.add(this.urlTemplate, false);
        this.urlTemplate__is_initialized = true;
        this.sizes = c.x(ImageSize.class, archive, this.sizes, false);
        this.sizes__is_initialized = true;
        List<String> listAdd = archive.add((List) this.tags, false, (ArchivingHandler) new StringHandler());
        this.tags = listAdd;
        this.tags__is_initialized = true;
        this.nativeObject = init(this.urlTemplate, this.sizes, listAdd);
    }

    public static class ImageSize implements Serializable {
        private Integer height;
        private String size;
        private Integer width;

        public ImageSize(@N String str, @P Integer num, @P Integer num2) {
            if (str == null) {
                throw new IllegalArgumentException("Required field \"size\" cannot be null");
            }
            this.size = str;
            this.width = num;
            this.height = num2;
        }

        @P
        public Integer getHeight() {
            return this.height;
        }

        @N
        public String getSize() {
            return this.size;
        }

        @P
        public Integer getWidth() {
            return this.width;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.size = archive.add(this.size, false);
            this.width = archive.add(this.width, true);
            this.height = archive.add(this.height, true);
        }

        public ImageSize() {
        }
    }

    public Image(@N String str, @N List<ImageSize> list, @N List<String> list2) {
        this.urlTemplate__is_initialized = false;
        this.sizes__is_initialized = false;
        this.tags__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"urlTemplate\" cannot be null");
        }
        if (list == null) {
            throw new IllegalArgumentException("Required field \"sizes\" cannot be null");
        }
        if (list2 != null) {
            this.nativeObject = init(str, list, list2);
            this.urlTemplate = str;
            this.urlTemplate__is_initialized = true;
            this.sizes = list;
            this.sizes__is_initialized = true;
            this.tags = list2;
            this.tags__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"tags\" cannot be null");
    }

    private Image(NativeObject nativeObject) {
        this.urlTemplate__is_initialized = false;
        this.sizes__is_initialized = false;
        this.tags__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
