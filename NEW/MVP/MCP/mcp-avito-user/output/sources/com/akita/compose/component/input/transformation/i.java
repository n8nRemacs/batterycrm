package com.akita.compose.component.input.transformation;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RoublesTransformation.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"input_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<String, String> f61808a = b.f61811l;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<String, String> f61809b = a.f61810l;

    /* compiled from: RoublesTransformation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<String, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f61810l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(String str) {
            return i.a(str);
        }
    }

    /* compiled from: RoublesTransformation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<String, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f61811l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(String str) {
            return i.a(str);
        }
    }

    public static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; sb2.length() < 21 && i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if ((i12 != 0 || cCharAt != '0' || str.length() == 1) && Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }
}
