package com.avito.android.beduin.common.component.photo_picker.data;

import Hq0.C14020b;
import Y61.k;
import android.net.Uri;
import com.avito.android.beduin.common.component.photo_picker.B;
import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinPhotoPickerInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/data/d;", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final B f101962a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<com.avito.android.beduin.common.component.photo_picker.data.a> f101963b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f101964c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f101965d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.photo_info.b f101966e;

    /* compiled from: BeduinPhotoPickerInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/data/d$a;", "", "<init>", "()V", "", "ALREADY_DECLARED_PATH", "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@k B b12, @k h31.e<com.avito.android.beduin.common.component.photo_picker.data.a> eVar, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.remote.error.f fVar, @k com.avito.android.photo_info.b bVar) {
        this.f101962a = b12;
        this.f101963b = eVar;
        this.f101964c = interfaceC35745a5;
        this.f101965d = fVar;
        this.f101966e = bVar;
    }

    @k
    public final C41982q1 a(@k BeduinPhotoPickerModel.ImageDeleteParams imageDeleteParams) {
        return new C42007e(new C14020b(5, this, imageDeleteParams)).r(e.f101967b).r(f.f101968b).u(new androidx.room.rxjava3.b(this, 4)).F().r0(P2.c.f318721a).x0(this.f101964c.a());
    }

    @k
    public final C41982q1 b(@k BeduinPhotoPickerModel.ImageUploadParams imageUploadParams, @k Uri uri) {
        return this.f101962a.a(imageUploadParams).a(uri).S().n(new g(this, imageUploadParams)).r(f.f101968b).u(new androidx.room.rxjava3.b(this, 4)).F().r0(P2.c.f318721a).x0(this.f101964c.a());
    }
}
