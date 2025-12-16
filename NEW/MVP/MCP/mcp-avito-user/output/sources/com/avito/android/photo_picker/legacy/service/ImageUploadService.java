package com.avito.android.photo_picker.legacy.service;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.z;
import com.avito.android.R;
import com.avito.android.di.C29972i;
import com.avito.android.di.component.E;
import com.avito.android.di.component.F;
import com.avito.android.di.component.u;
import com.avito.android.di.module.C30169r5;
import com.avito.android.remote.notification.A;
import com.avito.android.service.d;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageUploadService.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/photo_picker/legacy/service/ImageUploadService;", "Landroid/app/Service;", "Lcom/avito/android/service/d$a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImageUploadService extends Service implements d.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f219844f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public c f219845b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public com.avito.android.service.d f219846c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public A f219847d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f219848e = C42727D.c(new a());

    /* compiled from: ImageUploadService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/app/Notification;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Notification> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Notification invoke() {
            ImageUploadService imageUploadService = ImageUploadService.this;
            A a12 = imageUploadService.f219847d;
            if (a12 == null) {
                a12 = null;
            }
            z.n nVar = new z.n(imageUploadService, a12.b());
            nVar.g(16, true);
            nVar.f44585e = z.n.c(imageUploadService.getString(R.string.legacy_photo_picker_uploading_notification_title));
            nVar.f44586f = z.n.c(imageUploadService.getString(R.string.legacy_photo_picker_uploading_notification_description));
            nVar.f44601u = androidx.core.content.d.getColor(imageUploadService, R.color.legacy_blue);
            nVar.f44578B.icon = R.drawable.ic_notification;
            return nVar.b();
        }
    }

    @Override // com.avito.android.service.d.a
    public final void a(int i12) {
        stopForeground(true);
        stopSelf(i12);
    }

    @Override // android.app.Service
    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        E.a aVarA = u.a();
        aVarA.c((F) C29972i.a(C29972i.b(this), F.class));
        aVarA.b(C30169r5.f144559a);
        aVarA.a(new com.google.gson.d().a());
        aVarA.d(this);
        aVarA.build().a(this);
        onStart();
    }

    @Override // com.avito.android.service.d.a
    public final void onStart() {
        int i12 = Build.VERSION.SDK_INT;
        InterfaceC42726C interfaceC42726C = this.f219848e;
        if (i12 >= 29) {
            startForeground(13, (Notification) interfaceC42726C.getValue(), 1);
        } else {
            startForeground(13, (Notification) interfaceC42726C.getValue());
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(@Y61.l Intent intent, int i12, int i13) {
        com.avito.android.service.d dVar = this.f219846c;
        if (dVar == null) {
            dVar = null;
        }
        dVar.b(i13);
        String stringExtra = intent != null ? intent.getStringExtra("operation_id") : null;
        String stringExtra2 = intent != null ? intent.getStringExtra("photo_id") : null;
        Boolean boolValueOf = intent != null ? Boolean.valueOf(intent.getBooleanExtra("upload_after_non_restorable_error", false)) : null;
        if (stringExtra == null || boolValueOf == null) {
            com.avito.android.service.d dVar2 = this.f219846c;
            (dVar2 != null ? dVar2 : null).a();
            return 3;
        }
        boolean zBooleanValue = boolValueOf.booleanValue();
        c cVar = this.f219845b;
        (cVar != null ? cVar : null).a(stringExtra, stringExtra2, zBooleanValue).u0(new com.avito.android.photo_picker.legacy.service.a(this), new b(this));
        return 3;
    }

    public final void onTimeout(int i12, int i13) {
        stopSelf();
    }
}
