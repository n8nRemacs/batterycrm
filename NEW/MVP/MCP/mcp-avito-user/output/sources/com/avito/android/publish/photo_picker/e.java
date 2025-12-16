package com.avito.android.publish.photo_picker;

import Cd0.AbstractC13279o0;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.photo_cache.PhotoSource;
import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.ErrorType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import yc.C50213a;

/* compiled from: PublishImageUploadListener.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/photo_picker/e;", "Ln80/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements n80.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f238260a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C50213a f238261b;

    public e(@k InterfaceC28373a interfaceC28373a, @k C50213a c50213a) {
        this.f238260a = interfaceC28373a;
        this.f238261b = c50213a;
    }

    @Override // n80.b
    public final void a(@k PhotoUpload photoUpload, @k ErrorType errorType, @l Throwable th2) {
        InterfaceC28464o aVar;
        boolean zEquals = errorType.equals(ErrorType.NoError.INSTANCE);
        PhotoSource photoSource = photoUpload.f216306h;
        if (zEquals) {
            aVar = new AbstractC13279o0.b(this.f238261b, photoSource.f216299b, true, null, 8, null);
        } else {
            boolean zEquals2 = errorType.equals(ErrorType.NonRestorableError.INSTANCE);
            C50213a c50213a = this.f238261b;
            if (zEquals2) {
                aVar = new AbstractC13279o0.a(c50213a, photoSource.f216299b, true);
            } else {
                if (!errorType.equals(ErrorType.RestorableError.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new AbstractC13279o0.a(c50213a, photoSource.f216299b, false);
            }
        }
        this.f238260a.c(aVar);
    }
}
