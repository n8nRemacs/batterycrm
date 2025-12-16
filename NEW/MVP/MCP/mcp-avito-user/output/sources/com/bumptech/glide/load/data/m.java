package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.e;
import j.N;
import j.X;
import java.io.IOException;

/* compiled from: ParcelFileDescriptorRewinder.java */
/* loaded from: classes5.dex */
public final class m implements e<ParcelFileDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    public final b f338875a;

    /* compiled from: ParcelFileDescriptorRewinder.java */
    @X
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.e.a
        @N
        public final Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @N
        public final e<ParcelFileDescriptor> b(@N ParcelFileDescriptor parcelFileDescriptor) {
            return new m(parcelFileDescriptor);
        }
    }

    /* compiled from: ParcelFileDescriptorRewinder.java */
    @X
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final ParcelFileDescriptor f338876a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f338876a = parcelFileDescriptor;
        }
    }

    @X
    public m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f338875a = new b(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.e
    @N
    @X
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor a() throws IOException, ErrnoException {
        ParcelFileDescriptor parcelFileDescriptor = this.f338875a.f338876a;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e12) {
            throw new IOException(e12);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }
}
