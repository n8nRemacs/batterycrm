package com.avito.android.photo_camera_view;

import android.os.Build;
import com.avito.android.permissions.t;
import com.avito.android.photo_camera_view.C33174e;
import io.reactivex.rxjava3.internal.operators.observable.K;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: CameraItemPermissionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_camera_view/b;", "Lcom/avito/android/photo_camera_view/a;", "_avito_photo-camera-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_camera_view.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33171b implements InterfaceC33170a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.x f216368a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Boolean> f216369b = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Boolean> f216370c = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Boolean> f216371d = new com.jakewharton.rxrelay3.c<>();

    public C33171b(@Y61.k com.avito.android.permissions.x xVar) {
        this.f216368a = xVar;
    }

    public final void b() {
        com.avito.android.permissions.x xVar = this.f216368a;
        this.f216369b.accept(Boolean.valueOf(xVar.b("android.permission.CAMERA")));
        com.avito.android.permissions.t.f215141z.getClass();
        this.f216370c.accept(Boolean.valueOf(xVar.b(t.a.f215144c) || xVar.b("android.permission.READ_MEDIA_VISUAL_USER_SELECTED")));
        this.f216371d.accept(Boolean.valueOf(xVar.a("android.permission.CAMERA")));
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33170a
    public final void h(@Y61.k Y41.a aVar) {
        com.avito.android.permissions.x xVar = this.f216368a;
        if (xVar.a("android.permission.CAMERA")) {
            xVar.d(103, "android.permission.CAMERA");
        } else {
            ((C33174e.g) aVar).invoke();
        }
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33170a
    public final void i() {
        b();
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33170a
    @Y61.k
    public final K k() {
        return this.f216369b.A();
    }

    @Override // com.avito.android.permissions.y
    public final void l(int i12, @Y61.k String[] strArr, @Y61.k int[] iArr) {
        if (i12 != 103 || strArr.length == 0) {
            return;
        }
        b();
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33170a
    @Y61.k
    public final K n() {
        return this.f216370c.A();
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33170a
    @Y61.k
    public final K o() {
        return this.f216371d.A();
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33170a
    public final void q() {
        com.avito.android.permissions.t.f215141z.getClass();
        String str = t.a.f215144c;
        com.avito.android.permissions.x xVar = this.f216368a;
        boolean zB2 = xVar.b(str);
        boolean zB3 = xVar.b("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        String str2 = xVar.b("android.permission.CAMERA") ? null : "android.permission.CAMERA";
        if (zB2 || zB3) {
            str = null;
        }
        ArrayList arrayListB = C42756l.B(new String[]{str2, str, (Build.VERSION.SDK_INT < 33 || zB2 || zB3) ? null : "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        if (arrayListB.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) arrayListB.toArray(new String[0]);
        xVar.d(103, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
