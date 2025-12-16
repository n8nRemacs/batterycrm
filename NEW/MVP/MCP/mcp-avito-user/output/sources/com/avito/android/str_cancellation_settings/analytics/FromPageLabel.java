package com.avito.android.str_cancellation_settings.analytics;

import Y61.k;
import Y61.l;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FromPageLabel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/analytics/FromPageLabel;", "", "a", "_avito_str-cancellation-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FromPageLabel {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f288145c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ FromPageLabel[] f288146d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f288147e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f288148b;

    /* compiled from: FromPageLabel.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_cancellation_settings/analytics/FromPageLabel$a;", "", "<init>", "()V", "_avito_str-cancellation-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @l
        public static FromPageLabel a(@l String str) {
            Object next;
            Iterator it = ((AbstractC42738c) FromPageLabel.f288147e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((FromPageLabel) next).f288148b.equals(str)) {
                    break;
                }
            }
            return (FromPageLabel) next;
        }

        public a() {
        }
    }

    static {
        FromPageLabel[] fromPageLabelArr = {new FromPageLabel("STR_INVENTORY_EDIT", 0, "str_inventory_edit"), new FromPageLabel("REFUND_BANNER", 1, "refund_banner")};
        f288146d = fromPageLabelArr;
        f288147e = c.a(fromPageLabelArr);
        f288145c = new a(null);
    }

    public FromPageLabel(String str, int i12, String str2) {
        this.f288148b = str2;
    }

    public static FromPageLabel valueOf(String str) {
        return (FromPageLabel) Enum.valueOf(FromPageLabel.class, str);
    }

    public static FromPageLabel[] values() {
        return (FromPageLabel[]) f288146d.clone();
    }
}
