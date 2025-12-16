package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.tasks.C37030m;
import com.google.android.play.core.assetpacks.internal.C37146p;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37117e0 {

    /* renamed from: a, reason: collision with root package name */
    public final C37146p f358308a;

    public C37117e0(C37146p c37146p) {
        this.f358308a = c37146p;
    }

    public final ParcelFileDescriptor.AutoCloseInputStream a(int i12, int i13, String str, String str2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C37030m.a(((a2) this.f358308a.a()).c(i12, i13, str, str2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new C37184v0("Corrupted ParcelFileDescriptor, session " + i12 + " packName " + str + " sliceId " + str2 + ", chunkNumber " + i13, i12);
        } catch (InterruptedException e12) {
            throw new C37184v0(i12, "Extractor was interrupted while waiting for chunk file.", e12);
        } catch (ExecutionException e13) {
            throw new C37184v0(i12, "Error opening chunk file, session " + i12 + " packName " + str + " sliceId " + str2 + ", chunkNumber " + i13, e13);
        }
    }
}
