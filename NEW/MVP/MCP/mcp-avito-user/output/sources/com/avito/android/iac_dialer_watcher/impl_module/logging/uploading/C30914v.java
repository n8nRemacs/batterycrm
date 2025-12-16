package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import Fc1.E0;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import java.io.File;
import kotlin.C42829l0;
import kotlin.G0;
import kotlin.Metadata;
import okhttp3.MultipartBody;

/* compiled from: IacLogFileUploader.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000422\u0010\u0003\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001 \u0002*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/l0;", "Lokhttp3/MultipartBody$Part;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lkotlin/l0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30914v<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f168045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C30915w f168046c;

    public C30914v(File file, C30915w c30915w) {
        this.f168045b = file;
        this.f168046c = c30915w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        C42829l0 c42829l0 = (C42829l0) obj;
        MultipartBody.Part part = (MultipartBody.Part) c42829l0.f406871b;
        MultipartBody.Part part2 = (MultipartBody.Part) c42829l0.f406872c;
        MultipartBody.Part part3 = (MultipartBody.Part) c42829l0.f406873d;
        File file = this.f168045b;
        String name = file.getName();
        C30915w c30915w = this.f168046c;
        return new io.reactivex.rxjava3.internal.operators.completable.v(new C42017o(g1.a(c30915w.f168047a.a(part, part2, part3).z(c30915w.f168048b.a())).i(new C30912t(name)), new E0(file, 25))).B(G0.f406611a).k(new C30913u(name, c30915w));
    }
}
