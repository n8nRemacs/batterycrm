package com.avito.android.validation;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ValidationResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/validation/n1;", "", "a", "b", "c", "Lcom/avito/android/validation/n1$a;", "Lcom/avito/android/validation/n1$b;", "Lcom/avito/android/validation/n1$c;", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f319402a;

    /* compiled from: ValidationResult.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/validation/n1$a;", "Lcom/avito/android/validation/n1;", "a", "b", "c", "d", "e", "Lcom/avito/android/validation/n1$a$a;", "Lcom/avito/android/validation/n1$a$b;", "Lcom/avito/android/validation/n1$a$d;", "Lcom/avito/android/validation/n1$a$e;", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a extends n1 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f319403b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f319404c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f319405d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final DeepLink f319406e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f319407f;

        /* compiled from: ValidationResult.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/validation/n1$a$a;", "Lcom/avito/android/validation/n1$a;", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.validation.n1$a$a, reason: collision with other inner class name */
        public static final class C9897a extends a {

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final AttributedText f319408g;

            public C9897a(String str, String str2, AttributedText attributedText, String str3, DeepLink deepLink, int i12, C42822w c42822w) {
                super(str, str2, attributedText.getText(), (i12 & 8) != 0 ? null : str3, deepLink, null, 32, null);
                this.f319408g = attributedText;
            }
        }

        /* compiled from: ValidationResult.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/validation/n1$a$b;", "Lcom/avito/android/validation/n1$a;", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static class b extends a {
            public b(String str, String str2, String str3, String str4, DeepLink deepLink, String str5, int i12, C42822w c42822w) {
                super(str, str2, str3, (i12 & 8) != 0 ? null : str4, deepLink, (i12 & 32) != 0 ? null : str5, null);
            }
        }

        /* compiled from: ValidationResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/validation/n1$a$c;", "Lcom/avito/android/validation/n1$a$b;", "a", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends b {

            /* compiled from: ValidationResult.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/validation/n1$a$c$a;", "", "<init>", "()V", "", "DEFAULT_TEXT", "Ljava/lang/String;", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.validation.n1$a$c$a, reason: collision with other inner class name */
            public static final class C9898a {
                public /* synthetic */ C9898a(C42822w c42822w) {
                    this();
                }

                public C9898a() {
                }
            }

            static {
                new C9898a(null);
            }

            public c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l DeepLink deepLink) {
                super(str, str2, str3, null, deepLink, "required", 8, null);
            }
        }

        /* compiled from: ValidationResult.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/validation/n1$a$d;", "Lcom/avito/android/validation/n1$a;", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends a {
            public d(String str, String str2, String str3, String str4, DeepLink deepLink, String str5, int i12, C42822w c42822w) {
                super(str, str2, str3, (i12 & 8) != 0 ? null : str4, deepLink, str5, null);
            }
        }

        /* compiled from: ValidationResult.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/validation/n1$a$e;", "Lcom/avito/android/validation/n1$a;", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e extends a {
            public e(String str, String str2, String str3, String str4, DeepLink deepLink, String str5, int i12, C42822w c42822w) {
                super(str, str2, str3, (i12 & 8) != 0 ? null : str4, deepLink, str5, null);
            }
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, DeepLink deepLink, String str5, int i12, C42822w c42822w) {
            this(str, str2, str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : deepLink, (i12 & 32) != 0 ? null : str5, null);
        }

        public a(String str, String str2, String str3, String str4, DeepLink deepLink, String str5, C42822w c42822w) {
            super(str, null);
            this.f319403b = str2;
            this.f319404c = str3;
            this.f319405d = str4;
            this.f319406e = deepLink;
            this.f319407f = str5;
        }
    }

    /* compiled from: ValidationResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/validation/n1$b;", "Lcom/avito/android/validation/n1;", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends n1 {
    }

    /* compiled from: ValidationResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/validation/n1$c;", "Lcom/avito/android/validation/n1;", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends n1 {
    }

    public n1(String str, C42822w c42822w) {
        this.f319402a = str;
    }
}
