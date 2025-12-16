package com.avito.beduin.v2.component.common;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Arrangement.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/component/common/Arrangement;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Arrangement {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f335645c;

    /* renamed from: d, reason: collision with root package name */
    public static final Arrangement f335646d;

    /* renamed from: e, reason: collision with root package name */
    public static final Arrangement f335647e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Arrangement[] f335648f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f335649g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f335650b;

    /* compiled from: Arrangement.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/common/Arrangement$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static Arrangement a(@l String str, @k Arrangement arrangement) {
            Arrangement arrangement2;
            if (str == null) {
                return arrangement;
            }
            Arrangement[] arrangementArrValues = Arrangement.values();
            int length = arrangementArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    arrangement2 = null;
                    break;
                }
                arrangement2 = arrangementArrValues[i12];
                if (arrangement2.f335650b.equals(str)) {
                    break;
                }
                i12++;
            }
            return arrangement2 == null ? arrangement : arrangement2;
        }

        public a() {
        }
    }

    static {
        Arrangement arrangement = new Arrangement("Between", 0, "Between");
        f335646d = arrangement;
        Arrangement arrangement2 = new Arrangement("Around", 1, "Around");
        Arrangement arrangement3 = new Arrangement("Evenly", 2, "Evenly");
        Arrangement arrangement4 = new Arrangement("Start", 3, "Start");
        f335647e = arrangement4;
        Arrangement[] arrangementArr = {arrangement, arrangement2, arrangement3, arrangement4, new Arrangement("Center", 4, "Center"), new Arrangement("End", 5, "End")};
        f335648f = arrangementArr;
        f335649g = c.a(arrangementArr);
        f335645c = new a(null);
    }

    public Arrangement(String str, int i12, String str2) {
        this.f335650b = str2;
    }

    public static Arrangement valueOf(String str) {
        return (Arrangement) Enum.valueOf(Arrangement.class, str);
    }

    public static Arrangement[] values() {
        return (Arrangement[]) f335648f.clone();
    }
}
