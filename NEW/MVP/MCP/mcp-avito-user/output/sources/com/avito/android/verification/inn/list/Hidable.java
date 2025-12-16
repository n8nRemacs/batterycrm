package com.avito.android.verification.inn.list;

import Y61.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* compiled from: Hidable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/inn/list/Hidable;", "", "Hidden", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface Hidable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Hidable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/inn/list/Hidable$Hidden;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Hidden {

        /* renamed from: b, reason: collision with root package name */
        public static final Hidden f323896b;

        /* renamed from: c, reason: collision with root package name */
        public static final Hidden f323897c;

        /* renamed from: d, reason: collision with root package name */
        public static final Hidden f323898d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Hidden[] f323899e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ a f323900f;

        static {
            Hidden hidden = new Hidden("NOT_HIDDEN", 0);
            f323896b = hidden;
            Hidden hidden2 = new Hidden("BY_DISCLOSURE", 1);
            f323897c = hidden2;
            Hidden hidden3 = new Hidden("BY_CHECKBOXES", 2);
            f323898d = hidden3;
            Hidden[] hiddenArr = {hidden, hidden2, hidden3};
            f323899e = hiddenArr;
            f323900f = c.a(hiddenArr);
        }

        public Hidden() {
            throw null;
        }

        public static Hidden valueOf(String str) {
            return (Hidden) Enum.valueOf(Hidden.class, str);
        }

        public static Hidden[] values() {
            return (Hidden[]) f323899e.clone();
        }
    }

    @k
    com.avito.conveyor_item.a a(@k Hidden hidden);

    @k
    Map<String, Boolean> b();

    @k
    /* renamed from: f */
    Hidden getF323934c();
}
