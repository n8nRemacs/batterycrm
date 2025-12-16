package com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.C0;
import com.avito.android.remote.model.AdvertDuplicateResult;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import com.avito.android.util.R0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BasePretendPremoderationLoader.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/g;", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f241767a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.publish.pretend.e f241768b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.publish.premoderation.k f241769c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C0 f241770d;

    /* compiled from: BasePretendPremoderationLoader.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bt\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$a;", "", "a", "b", "c", "d", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$a$a;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$a$b;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$a$c;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a$a, reason: collision with other inner class name */
    public interface InterfaceC7239a {

        /* compiled from: BasePretendPremoderationLoader.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$a$a;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a$a$a, reason: collision with other inner class name */
        public static final class C7240a implements InterfaceC7239a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final AdvertDuplicateResult f241771a;

            public C7240a(@k AdvertDuplicateResult advertDuplicateResult) {
                this.f241771a = advertDuplicateResult;
            }
        }

        /* compiled from: BasePretendPremoderationLoader.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$a$b;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a$a$b */
        public static final /* data */ class b implements InterfaceC7239a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f241772a;

            public b(@k String str) {
                this.f241772a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f241772a, ((b) obj).f241772a);
            }

            public final int hashCode() {
                return this.f241772a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Error(message="), this.f241772a, ')');
            }
        }

        /* compiled from: BasePretendPremoderationLoader.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$a$c;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a$a$c */
        public static final /* data */ class c implements InterfaceC7239a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f241773a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1590448145;
            }

            @k
            public final String toString() {
                return "Success";
            }
        }

        /* compiled from: BasePretendPremoderationLoader.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$a$d;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a$a$d */
        public static final class d implements InterfaceC7239a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final AdvertProactiveModerationResult.WrongCategorySuggest f241774a;

            public d(@k AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest) {
                this.f241774a = wrongCategorySuggest;
            }
        }
    }

    /* compiled from: BasePretendPremoderationLoader.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bt\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$b;", "", "a", "b", "c", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$b$a;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$b$b;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$b$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: BasePretendPremoderationLoader.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$b$a;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C7241a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f241775a;

            public C7241a(@k String str) {
                this.f241775a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7241a) && L.f(this.f241775a, ((C7241a) obj).f241775a);
            }

            public final int hashCode() {
                return this.f241775a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Error(message="), this.f241775a, ')');
            }
        }

        /* compiled from: BasePretendPremoderationLoader.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$b$b;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C7242b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C7242b f241776a = new C7242b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C7242b);
            }

            public final int hashCode() {
                return 1081307616;
            }

            @k
            public final String toString() {
                return "ErrorsHandled";
            }
        }

        /* compiled from: BasePretendPremoderationLoader.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$b$c;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f241777a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 474392530;
            }

            @k
            public final String toString() {
                return "Success";
            }
        }
    }

    public a(@k R0 r02, @k com.avito.android.publish.pretend.e eVar, @k com.avito.android.publish.premoderation.k kVar, @k C0 c02) {
        this.f241767a = r02;
        this.f241768b = eVar;
        this.f241769c = kVar;
        this.f241770d = c02;
    }
}
