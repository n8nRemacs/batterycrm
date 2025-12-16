package com.avito.android.publish.photo_permission;

import AK0.l;
import Y61.k;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import ke0.InterfaceC42675a;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: PhotoCameraPermissionAskStorage.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/photo_permission/a;", "Lcom/avito/android/publish/photo_permission/c;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f238251a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42675a f238252b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f238253c = C42727D.b(LazyThreadSafetyMode.f406616d, new b());

    /* compiled from: PhotoCameraPermissionAskStorage.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/publish/photo_permission/a$a;", "", "<init>", "()V", "", "CAMERA_PERMISSION_ATTEMPTS_COUNT", "I", "", "CAMERA_PERMISSION_ATTEMPTS_COUNT_NAME", "Ljava/lang/String;", "CAMERA_PERMISSION_SHOWED_NAME_PREFIX", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.photo_permission.a$a, reason: collision with other inner class name */
    public static final class C7158a {
        public /* synthetic */ C7158a(C42822w c42822w) {
            this();
        }

        public C7158a() {
        }
    }

    /* compiled from: PhotoCameraPermissionAskStorage.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return "camera_permission_showed_on_publish_" + a.this.f238252b.A1();
        }
    }

    static {
        new C7158a(null);
    }

    @Inject
    public a(@k l lVar, @k InterfaceC42675a interfaceC42675a) {
        this.f238251a = lVar;
        this.f238252b = interfaceC42675a;
    }

    public final void a() {
        this.f238251a.getF316a().edit().remove("camera_permission_attempts_count_on_publish").apply();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.C] */
    public final boolean b() {
        l lVar = this.f238251a;
        int i12 = lVar.getF316a().getInt("camera_permission_attempts_count_on_publish", 0);
        if (i12 >= 3) {
            return false;
        }
        SharedPreferences f316a = lVar.getF316a();
        ?? r52 = this.f238253c;
        boolean z12 = f316a.getBoolean((String) r52.getValue(), false);
        if (!z12) {
            lVar.getF316a().edit().putBoolean((String) r52.getValue(), true).apply();
            lVar.getF316a().edit().putInt("camera_permission_attempts_count_on_publish", i12 + 1).apply();
        }
        return !z12;
    }
}
