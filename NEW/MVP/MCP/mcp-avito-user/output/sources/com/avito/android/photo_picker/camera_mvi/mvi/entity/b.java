package com.avito.android.photo_picker.camera_mvi.mvi.entity;

import android.net.Uri;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState;
import kotlin.Metadata;

/* compiled from: CameraOneTimeEvent.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$a;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$b;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$c;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$d;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$e;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$f;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$g;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$h;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$i;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$j;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$k;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$l;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$m;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: CameraOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$a;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CameraState.CameraType f219204a;

        public a(@Y61.k CameraState.CameraType cameraType) {
            this.f219204a = cameraType;
        }
    }

    /* compiled from: CameraOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$b;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_picker.camera_mvi.mvi.entity.b$b, reason: collision with other inner class name */
    public static final class C6588b implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CameraState.Flash f219205a;

        public C6588b(@Y61.k CameraState.Flash flash) {
            this.f219205a = flash;
        }
    }

    /* compiled from: CameraOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$c;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f219206a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1679346431;
        }

        @Y61.k
        public final String toString() {
            return "ClosePicker";
        }
    }

    /* compiled from: CameraOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$d;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f219207a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -966444597;
        }

        @Y61.k
        public final String toString() {
            return "GoToSettings";
        }
    }

    /* compiled from: CameraOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$e;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f219208a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 518450425;
        }

        @Y61.k
        public final String toString() {
            return "OpenEdit";
        }
    }

    /* compiled from: CameraOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$f;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f219209a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2145967619;
        }

        @Y61.k
        public final String toString() {
            return "OpenGallery";
        }
    }

    /* compiled from: CameraOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$g;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f219210a;

        public g(@Y61.k Uri uri) {
            this.f219210a = uri;
        }
    }

    /* compiled from: CameraOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$h;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f219211a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 411984436;
        }

        @Y61.k
        public final String toString() {
            return "RequireCameraPermission";
        }
    }

    /* compiled from: CameraOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$i;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements b {

        /* renamed from: a, reason: collision with root package name */
        public final float f219212a;

        /* renamed from: b, reason: collision with root package name */
        public final float f219213b;

        public i(float f12, float f13) {
            this.f219212a = f12;
            this.f219213b = f13;
        }
    }

    /* compiled from: CameraOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$j;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CameraState.Ratio f219214a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f219215b;

        public j(@Y61.k CameraState.Ratio ratio, boolean z12) {
            this.f219214a = ratio;
            this.f219215b = z12;
        }
    }

    /* compiled from: CameraOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$k;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f219216a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1919605114;
        }

        @Y61.k
        public final String toString() {
            return "ShowSelectedPhotosAnimation";
        }
    }

    /* compiled from: CameraOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$l;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f219217a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -173814862;
        }

        @Y61.k
        public final String toString() {
            return "StartCameraInitialize";
        }
    }

    /* compiled from: CameraOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b$m;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f219218a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1144918778;
        }

        @Y61.k
        public final String toString() {
            return "TakePhoto";
        }
    }
}
