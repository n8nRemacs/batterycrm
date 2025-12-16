package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.transport.masstransit.SectionMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class SectionMetadataInternal implements BaseMetadata, Serializable {
    private boolean isPassThroughTransportSection;
    private boolean isPassThroughTransportSection__is_initialized;
    private SectionMetadata metadata;
    private boolean metadata__is_initialized;
    private NativeObject nativeObject;

    public SectionMetadataInternal() {
        this.metadata__is_initialized = false;
        this.isPassThroughTransportSection__is_initialized = false;
    }

    private native boolean getIsPassThroughTransportSection__Native();

    private native SectionMetadata getMetadata__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::internal::SectionMetadataInternal";
    }

    private native NativeObject init(SectionMetadata sectionMetadata, boolean z12);

    public synchronized boolean getIsPassThroughTransportSection() {
        try {
            if (!this.isPassThroughTransportSection__is_initialized) {
                this.isPassThroughTransportSection = getIsPassThroughTransportSection__Native();
                this.isPassThroughTransportSection__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.isPassThroughTransportSection;
    }

    @N
    public synchronized SectionMetadata getMetadata() {
        try {
            if (!this.metadata__is_initialized) {
                this.metadata = getMetadata__Native();
                this.metadata__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.metadata;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getMetadata(), false, (Class<Archive>) SectionMetadata.class);
            archive.add(getIsPassThroughTransportSection());
            return;
        }
        this.metadata = (SectionMetadata) archive.add((Archive) this.metadata, false, (Class<Archive>) SectionMetadata.class);
        this.metadata__is_initialized = true;
        boolean zAdd = archive.add(this.isPassThroughTransportSection);
        this.isPassThroughTransportSection = zAdd;
        this.isPassThroughTransportSection__is_initialized = true;
        this.nativeObject = init(this.metadata, zAdd);
    }

    public SectionMetadataInternal(@N SectionMetadata sectionMetadata, boolean z12) {
        this.metadata__is_initialized = false;
        this.isPassThroughTransportSection__is_initialized = false;
        if (sectionMetadata != null) {
            this.nativeObject = init(sectionMetadata, z12);
            this.metadata = sectionMetadata;
            this.metadata__is_initialized = true;
            this.isPassThroughTransportSection = z12;
            this.isPassThroughTransportSection__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"metadata\" cannot be null");
    }

    private SectionMetadataInternal(NativeObject nativeObject) {
        this.metadata__is_initialized = false;
        this.isPassThroughTransportSection__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
