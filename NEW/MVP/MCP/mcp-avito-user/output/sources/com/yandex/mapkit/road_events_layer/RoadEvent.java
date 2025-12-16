package com.yandex.mapkit.road_events_layer;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class RoadEvent implements Serializable {
    private String caption;
    private boolean caption__is_initialized;

    /* renamed from: id, reason: collision with root package name */
    private String f377459id;
    private boolean id__is_initialized;
    private boolean isInFuture;
    private boolean isInFuture__is_initialized;
    private NativeObject nativeObject;
    private Point position;
    private boolean position__is_initialized;
    private List<EventTag> tags;
    private boolean tags__is_initialized;

    public RoadEvent() {
        this.id__is_initialized = false;
        this.position__is_initialized = false;
        this.tags__is_initialized = false;
        this.caption__is_initialized = false;
        this.isInFuture__is_initialized = false;
    }

    private native String getCaption__Native();

    private native String getId__Native();

    private native boolean getIsInFuture__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::road_events_layer::RoadEvent";
    }

    private native Point getPosition__Native();

    private native List<EventTag> getTags__Native();

    private native NativeObject init(String str, Point point, List<EventTag> list, String str2, boolean z12);

    @N
    public synchronized String getCaption() {
        try {
            if (!this.caption__is_initialized) {
                this.caption = getCaption__Native();
                this.caption__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.caption;
    }

    @N
    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.f377459id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f377459id;
    }

    public synchronized boolean getIsInFuture() {
        try {
            if (!this.isInFuture__is_initialized) {
                this.isInFuture = getIsInFuture__Native();
                this.isInFuture__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.isInFuture;
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

    @N
    public synchronized List<EventTag> getTags() {
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

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add((Archive) getPosition(), false, (Class<Archive>) Point.class);
            archive.add((List) getTags(), false, (ArchivingHandler) new EnumHandler(EventTag.class));
            archive.add(getCaption(), false);
            archive.add(getIsInFuture());
            return;
        }
        this.f377459id = archive.add(this.f377459id, false);
        this.id__is_initialized = true;
        this.position = (Point) archive.add((Archive) this.position, false, (Class<Archive>) Point.class);
        this.position__is_initialized = true;
        this.tags = archive.add((List) this.tags, false, (ArchivingHandler) new EnumHandler(EventTag.class));
        this.tags__is_initialized = true;
        this.caption = archive.add(this.caption, false);
        this.caption__is_initialized = true;
        boolean zAdd = archive.add(this.isInFuture);
        this.isInFuture = zAdd;
        this.isInFuture__is_initialized = true;
        this.nativeObject = init(this.f377459id, this.position, this.tags, this.caption, zAdd);
    }

    public RoadEvent(@N String str, @N Point point, @N List<EventTag> list, @N String str2, boolean z12) {
        this.id__is_initialized = false;
        this.position__is_initialized = false;
        this.tags__is_initialized = false;
        this.caption__is_initialized = false;
        this.isInFuture__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (point == null) {
            throw new IllegalArgumentException("Required field \"position\" cannot be null");
        }
        if (list == null) {
            throw new IllegalArgumentException("Required field \"tags\" cannot be null");
        }
        if (str2 != null) {
            this.nativeObject = init(str, point, list, str2, z12);
            this.f377459id = str;
            this.id__is_initialized = true;
            this.position = point;
            this.position__is_initialized = true;
            this.tags = list;
            this.tags__is_initialized = true;
            this.caption = str2;
            this.caption__is_initialized = true;
            this.isInFuture = z12;
            this.isInFuture__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"caption\" cannot be null");
    }

    private RoadEvent(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.position__is_initialized = false;
        this.tags__is_initialized = false;
        this.caption__is_initialized = false;
        this.isInFuture__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
