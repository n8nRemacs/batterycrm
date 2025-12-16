package com.avito.android.profile_management_core.images;

import Y41.p;
import android.net.Uri;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.remote.model.extended.modification.ModificationBody;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;

/* compiled from: ProfileManagementImageInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_management_core/images/a;", "", "b", "c", "d", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: ProfileManagementImageInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_management_core.images.a$a, reason: collision with other inner class name */
    public static final class C6876a {
    }

    /* compiled from: ProfileManagementImageInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_management_core/images/a$b;", "", "a", "b", "Lcom/avito/android/profile_management_core/images/a$b$a;", "Lcom/avito/android/profile_management_core/images/a$b$b;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ProfileManagementImageInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/images/a$b$a;", "Lcom/avito/android/profile_management_core/images/a$b;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_management_core.images.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C6877a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final UploadImage f226622a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Throwable f226623b;

            public C6877a(@Y61.k UploadImage uploadImage, @Y61.k Throwable th2) {
                this.f226622a = uploadImage;
                this.f226623b = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6877a)) {
                    return false;
                }
                C6877a c6877a = (C6877a) obj;
                return L.f(this.f226622a, c6877a.f226622a) && L.f(this.f226623b, c6877a.f226623b);
            }

            public final int hashCode() {
                return this.f226623b.hashCode() + (this.f226622a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Failure(image=");
                sb2.append(this.f226622a);
                sb2.append(", throwable=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f226623b, ')');
            }
        }

        /* compiled from: ProfileManagementImageInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/images/a$b$b;", "Lcom/avito/android/profile_management_core/images/a$b;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_management_core.images.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C6878b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final UploadImage f226624a;

            public C6878b(@Y61.k UploadImage uploadImage) {
                this.f226624a = uploadImage;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6878b) && L.f(this.f226624a, ((C6878b) obj).f226624a);
            }

            public final int hashCode() {
                return this.f226624a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Success(image=" + this.f226624a + ')';
            }
        }
    }

    /* compiled from: ProfileManagementImageInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_management_core/images/a$c;", "", "a", "b", "Lcom/avito/android/profile_management_core/images/a$c$a;", "Lcom/avito/android/profile_management_core/images/a$c$b;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: ProfileManagementImageInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/images/a$c$a;", "Lcom/avito/android/profile_management_core/images/a$c;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_management_core.images.a$c$a, reason: collision with other inner class name */
        public static final /* data */ class C6879a implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Throwable f226625a;

            public C6879a(@Y61.k Throwable th2) {
                this.f226625a = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6879a) && L.f(this.f226625a, ((C6879a) obj).f226625a);
            }

            public final int hashCode() {
                return this.f226625a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Failure(error="), this.f226625a, ')');
            }
        }

        /* compiled from: ProfileManagementImageInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/images/a$c$b;", "Lcom/avito/android/profile_management_core/images/a$c;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ArrayList f226626a;

            public b(@Y61.k ArrayList arrayList) {
                this.f226626a = arrayList;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f226626a.equals(((b) obj).f226626a);
            }

            public final int hashCode() {
                return this.f226626a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("ImagesUpdate(images="), this.f226626a, ')');
            }
        }
    }

    /* compiled from: ProfileManagementImageInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_management_core/images/a$d;", "", "a", "b", "Lcom/avito/android/profile_management_core/images/a$d$a;", "Lcom/avito/android/profile_management_core/images/a$d$b;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {

        /* compiled from: ProfileManagementImageInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/images/a$d$a;", "Lcom/avito/android/profile_management_core/images/a$d;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_management_core.images.a$d$a, reason: collision with other inner class name */
        public static final /* data */ class C6880a implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Throwable f226627a;

            public C6880a(@Y61.k Throwable th2) {
                this.f226627a = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6880a) && L.f(this.f226627a, ((C6880a) obj).f226627a);
            }

            public final int hashCode() {
                return this.f226627a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Failure(error="), this.f226627a, ')');
            }
        }

        /* compiled from: ProfileManagementImageInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/images/a$d$b;", "Lcom/avito/android/profile_management_core/images/a$d;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final UploadImage.ImageFromPhotoPicker f226628a;

            public b(@Y61.k UploadImage.ImageFromPhotoPicker imageFromPhotoPicker) {
                this.f226628a = imageFromPhotoPicker;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f226628a, ((b) obj).f226628a);
            }

            public final int hashCode() {
                return this.f226628a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ImageUpdate(image=" + this.f226628a + ')';
            }
        }
    }

    @Y61.l
    Object a(@Y61.k SuspendLambda suspendLambda);

    @Y61.k
    InterfaceC43160i b(@Y61.k String str, @Y61.k ArrayList arrayList, @Y61.k ArrayList arrayList2);

    @Y61.l
    Object c(@Y61.k SuspendLambda suspendLambda);

    void d(@Y61.k List<? extends Uri> list);

    @Y61.k
    X e(@Y61.k UploadImage.ImageFromPhotoPicker imageFromPhotoPicker);

    @Y61.k
    InterfaceC43160i<d> f(@Y61.k UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, @Y61.k p<? super UploadImage.ImageFromPhotoPicker, ? super Long, ModificationBody> pVar);

    @Y61.k
    InterfaceC43160i<d> g(@Y61.k UploadImage.ImageFromPhotoPicker imageFromPhotoPicker);

    @Y61.l
    Object h(@Y61.k UploadImage uploadImage, @Y61.k Continuation continuation);

    @Y61.l
    Object i(@Y61.k String str, @Y61.k UploadImage.Type type, @Y61.l String str2, @Y61.k SuspendLambda suspendLambda);

    @Y61.k
    kotlinx.coroutines.flow.internal.m j(@Y61.k List list);

    @Y61.k
    InterfaceC43160i<d> k(@Y61.k UploadImage.ImageFromPhotoPicker imageFromPhotoPicker);
}
