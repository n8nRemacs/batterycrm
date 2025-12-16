package com.airbnb.lottie.compose;

import android.net.Uri;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import j.V;
import kotlin.Metadata;

/* compiled from: LottieCompositionSpec.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/airbnb/lottie/compose/x;", "", "a", "b", "c", "d", "e", "f", "Lcom/airbnb/lottie/compose/x$a;", "Lcom/airbnb/lottie/compose/x$b;", "Lcom/airbnb/lottie/compose/x$c;", "Lcom/airbnb/lottie/compose/x$d;", "Lcom/airbnb/lottie/compose/x$e;", "Lcom/airbnb/lottie/compose/x$f;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface x {

    /* compiled from: LottieCompositionSpec.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/x$a;", "Lcom/airbnb/lottie/compose/x;", "assetName", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f59557a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return kotlin.jvm.internal.L.f(this.f59557a, ((a) obj).f59557a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f59557a.hashCode();
        }

        public final String toString() {
            return AK.c.s(new StringBuilder("Asset(assetName="), this.f59557a, ")");
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/x$b;", "Lcom/airbnb/lottie/compose/x;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f59558a;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return kotlin.jvm.internal.L.f(this.f59558a, ((b) obj).f59558a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f59558a.hashCode();
        }

        public final String toString() {
            return "ContentProvider(uri=" + this.f59558a + ")";
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/x$c;", "Lcom/airbnb/lottie/compose/x;", "fileName", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f59559a;

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return kotlin.jvm.internal.L.f(this.f59559a, ((c) obj).f59559a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f59559a.hashCode();
        }

        public final String toString() {
            return AK.c.s(new StringBuilder("File(fileName="), this.f59559a, ")");
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/x$d;", "Lcom/airbnb/lottie/compose/x;", "jsonString", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f59560a;

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return kotlin.jvm.internal.L.f(this.f59560a, ((d) obj).f59560a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f59560a.hashCode();
        }

        public final String toString() {
            return AK.c.s(new StringBuilder("JsonString(jsonString="), this.f59560a, ")");
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/x$e;", "Lcom/airbnb/lottie/compose/x;", "resId", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements x {

        /* renamed from: a, reason: collision with root package name */
        public final int f59561a;

        private /* synthetic */ e(@V int i12) {
            this.f59561a = i12;
        }

        public static final /* synthetic */ e a() {
            return new e(R.raw.loader_animation);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof e) {
                return this.f59561a == ((e) obj).f59561a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f59561a);
        }

        public final String toString() {
            return AK.c.i(this.f59561a, ")", new StringBuilder("RawRes(resId="));
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/x$f;", "Lcom/airbnb/lottie/compose/x;", ContextActionHandler.Link.URL, "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f59562a;

        public final boolean equals(Object obj) {
            if (obj instanceof f) {
                return kotlin.jvm.internal.L.f(this.f59562a, ((f) obj).f59562a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f59562a.hashCode();
        }

        public final String toString() {
            return AK.c.s(new StringBuilder("Url(url="), this.f59562a, ")");
        }
    }
}
