package com.avito.android.deep_linking.links.error;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.ui.graphics.colorspace.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeeplinkParsingError.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError;", "Ljava/lang/IllegalAccessException;", "Custom", "DeeplinkNotFound", "ExpectedPublicDeeplink", "FeatureToggleDisabled", "FieldConstraint", "ParserNotFound", "WrongParameterValue", "WrongRegion", "WrongScheme", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$Custom;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$DeeplinkNotFound;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$ExpectedPublicDeeplink;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FeatureToggleDisabled;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$ParserNotFound;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$WrongParameterValue;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$WrongRegion;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$WrongScheme;", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DeeplinkParsingError extends IllegalAccessException {

    /* compiled from: DeeplinkParsingError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$Custom;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError;", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Custom extends DeeplinkParsingError {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f133985b;

        public /* synthetic */ Custom(String str, String str2, Throwable th2, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : th2);
        }

        @Override // java.lang.Throwable
        @l
        public final Throwable getCause() {
            return this.f133985b;
        }

        public Custom(@k String str, @k String str2, @l Throwable th2) {
            super(str, str2, null);
            this.f133985b = th2;
        }
    }

    /* compiled from: DeeplinkParsingError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$DeeplinkNotFound;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError;", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DeeplinkNotFound extends DeeplinkParsingError {
    }

    /* compiled from: DeeplinkParsingError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$ExpectedPublicDeeplink;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError;", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ExpectedPublicDeeplink extends DeeplinkParsingError {
        public ExpectedPublicDeeplink(@k String str) {
            super(str, "Given Deeplink is Not Public. Try to inherit from PublicDeeplink", null);
        }
    }

    /* compiled from: DeeplinkParsingError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FeatureToggleDisabled;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError;", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FeatureToggleDisabled extends DeeplinkParsingError {
    }

    /* compiled from: DeeplinkParsingError.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint;", "", "a", "b", "Json", "c", "String", "d", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint$a;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint$b;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint$Json;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint$c;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint$String;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint$d;", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface FieldConstraint {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DeeplinkParsingError.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint$Json;", "", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint;", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Json implements FieldConstraint {

            /* renamed from: b, reason: collision with root package name */
            public static final Json f133986b;

            /* renamed from: c, reason: collision with root package name */
            public static final Json f133987c;

            /* renamed from: d, reason: collision with root package name */
            public static final Json f133988d;

            /* renamed from: e, reason: collision with root package name */
            public static final Json f133989e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ Json[] f133990f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f133991g;

            static {
                Json json = new Json("Nullable", 0);
                f133986b = json;
                Json json2 = new Json("NonNull", 1);
                f133987c = json2;
                Json json3 = new Json("ListNonEmpty", 2);
                f133988d = json3;
                Json json4 = new Json("MapNonEmpty", 3);
                f133989e = json4;
                Json[] jsonArr = {json, json2, json3, json4};
                f133990f = jsonArr;
                f133991g = kotlin.enums.c.a(jsonArr);
            }

            public Json() {
                throw null;
            }

            public static Json valueOf(java.lang.String str) {
                return (Json) Enum.valueOf(Json.class, str);
            }

            public static Json[] values() {
                return (Json[]) f133990f.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DeeplinkParsingError.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint$String;", "", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint;", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class String implements FieldConstraint {

            /* renamed from: b, reason: collision with root package name */
            public static final String f133992b;

            /* renamed from: c, reason: collision with root package name */
            public static final String f133993c;

            /* renamed from: d, reason: collision with root package name */
            public static final String f133994d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ String[] f133995e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f133996f;

            static {
                String string = new String("NonNull", 0);
                f133992b = string;
                String string2 = new String("NonEmpty", 1);
                f133993c = string2;
                String string3 = new String("NonBlank", 2);
                f133994d = string3;
                String[] stringArr = {string, string2, string3};
                f133995e = stringArr;
                f133996f = kotlin.enums.c.a(stringArr);
            }

            public String() {
                throw null;
            }

            public static String valueOf(java.lang.String str) {
                return (String) Enum.valueOf(String.class, str);
            }

            public static String[] values() {
                return (String[]) f133995e.clone();
            }
        }

        /* compiled from: DeeplinkParsingError.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint$a;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint;", "<init>", "()V", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements FieldConstraint {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f133997b = new a();
        }

        /* compiled from: DeeplinkParsingError.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint$b;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint;", "<init>", "()V", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements FieldConstraint {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final b f133998b = new b();
        }

        /* compiled from: DeeplinkParsingError.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint$c;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint;", "<init>", "()V", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements FieldConstraint {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f133999b = new c();
        }

        /* compiled from: DeeplinkParsingError.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint$d;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$FieldConstraint;", "<init>", "()V", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements FieldConstraint {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final d f134000b = new d();
        }
    }

    /* compiled from: DeeplinkParsingError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$ParserNotFound;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError;", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ParserNotFound extends DeeplinkParsingError {
    }

    /* compiled from: DeeplinkParsingError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$WrongParameterValue;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError;", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WrongParameterValue extends DeeplinkParsingError {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final FieldConstraint f134001b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f134002c;

        public /* synthetic */ WrongParameterValue(String str, String str2, FieldConstraint fieldConstraint, Throwable th2, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : fieldConstraint, (i12 & 8) != 0 ? null : th2);
        }

        @Override // java.lang.Throwable
        @l
        public final Throwable getCause() {
            return this.f134002c;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public WrongParameterValue(@k String str, @k String str2, @l FieldConstraint fieldConstraint, @l Throwable th2) {
            String strK;
            String str3;
            if (fieldConstraint != null) {
                StringBuilder sbA = r.A("Parameter \"", str2, "\" must be ");
                if (fieldConstraint instanceof FieldConstraint.String) {
                    if (fieldConstraint == FieldConstraint.String.f133992b) {
                        str3 = "non-null string";
                    } else if (fieldConstraint == FieldConstraint.String.f133993c) {
                        str3 = "non-empty string";
                    } else {
                        if (fieldConstraint != FieldConstraint.String.f133994d) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str3 = "non-blank string";
                    }
                } else if (L.f(fieldConstraint, FieldConstraint.b.f133998b)) {
                    str3 = "non-null integer";
                } else if (L.f(fieldConstraint, FieldConstraint.c.f133999b)) {
                    str3 = "non-null long";
                } else if (L.f(fieldConstraint, FieldConstraint.a.f133997b)) {
                    str3 = "non-null double";
                } else if (L.f(fieldConstraint, FieldConstraint.d.f134000b)) {
                    str3 = "non-null url";
                } else {
                    if (!(fieldConstraint instanceof FieldConstraint.Json)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (fieldConstraint == FieldConstraint.Json.f133986b) {
                        str3 = "null or json-object";
                    } else if (fieldConstraint == FieldConstraint.Json.f133987c) {
                        str3 = "non-null json-object";
                    } else if (fieldConstraint == FieldConstraint.Json.f133988d) {
                        str3 = "non-empty json-list";
                    } else {
                        if (fieldConstraint != FieldConstraint.Json.f133989e) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str3 = "non-empty json-map";
                    }
                }
                sbA.append(str3);
                strK = sbA.toString();
            } else {
                strK = c.k("Parameter \"", str2, "\" has incorrect value");
            }
            super(str, strK, null);
            this.f134001b = fieldConstraint;
            this.f134002c = th2;
        }
    }

    /* compiled from: DeeplinkParsingError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$WrongRegion;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError;", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WrongRegion extends DeeplinkParsingError {
    }

    /* compiled from: DeeplinkParsingError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError$WrongScheme;", "Lcom/avito/android/deep_linking/links/error/DeeplinkParsingError;", "_common_deeplinks_generator_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WrongScheme extends DeeplinkParsingError {
        public WrongScheme() {
            throw null;
        }
    }

    public DeeplinkParsingError(String str, String str2, C42822w c42822w) {
        super(e.n("Error while trying to parse Deeplink: ", str, ". ", str2));
    }
}
