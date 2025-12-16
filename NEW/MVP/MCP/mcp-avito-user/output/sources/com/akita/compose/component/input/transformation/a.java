package com.akita.compose.component.input.transformation;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: DateTransformation.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"input_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<String, String> f61787a = b.f61790l;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<String, String> f61788b = C2088a.f61789l;

    /* compiled from: DateTransformation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.component.input.transformation.a$a, reason: collision with other inner class name */
    public static final class C2088a extends N implements Y41.l<String, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2088a f61789l = new C2088a();

        public C2088a() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(String str) {
            String strA = a.a(str);
            StringBuilder sb2 = new StringBuilder();
            int length = strA.length();
            for (int i12 = 0; i12 < length; i12++) {
                sb2.append(strA.charAt(i12));
                if ((i12 == 1 || i12 == 3) && i12 != strA.length() - 1) {
                    sb2.append('.');
                }
            }
            return sb2.toString();
        }
    }

    /* compiled from: DateTransformation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<String, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f61790l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(String str) {
            return a.a(str);
        }
    }

    public static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return C43066x.t0(8, sb2.toString());
    }
}
