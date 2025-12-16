package com.avito.beduin.v2.interaction.detached.flow;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DetachComponentClient.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/BottomSheetModalSize;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BottomSheetModalSize {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f337308b;

    /* renamed from: c, reason: collision with root package name */
    public static final BottomSheetModalSize f337309c;

    /* renamed from: d, reason: collision with root package name */
    public static final BottomSheetModalSize f337310d;

    /* renamed from: e, reason: collision with root package name */
    public static final BottomSheetModalSize f337311e;

    /* renamed from: f, reason: collision with root package name */
    public static final BottomSheetModalSize f337312f;

    /* renamed from: g, reason: collision with root package name */
    public static final BottomSheetModalSize f337313g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ BottomSheetModalSize[] f337314h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f337315i;

    /* compiled from: DetachComponentClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/BottomSheetModalSize$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static BottomSheetModalSize a(@l String str) {
            int iHashCode = str.hashCode();
            if (iHashCode != 108) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3828) {
                            if (iHashCode == 3835 && str.equals("xs")) {
                                return BottomSheetModalSize.f337309c;
                            }
                        } else if (str.equals("xl")) {
                            return BottomSheetModalSize.f337313g;
                        }
                    } else if (str.equals("s")) {
                        return BottomSheetModalSize.f337310d;
                    }
                } else if (str.equals("m")) {
                    return BottomSheetModalSize.f337311e;
                }
            } else if (str.equals("l")) {
                return BottomSheetModalSize.f337312f;
            }
            return BottomSheetModalSize.f337311e;
        }

        public a() {
        }
    }

    static {
        BottomSheetModalSize bottomSheetModalSize = new BottomSheetModalSize("xs", 0);
        f337309c = bottomSheetModalSize;
        BottomSheetModalSize bottomSheetModalSize2 = new BottomSheetModalSize("s", 1);
        f337310d = bottomSheetModalSize2;
        BottomSheetModalSize bottomSheetModalSize3 = new BottomSheetModalSize("m", 2);
        f337311e = bottomSheetModalSize3;
        BottomSheetModalSize bottomSheetModalSize4 = new BottomSheetModalSize("l", 3);
        f337312f = bottomSheetModalSize4;
        BottomSheetModalSize bottomSheetModalSize5 = new BottomSheetModalSize("xl", 4);
        f337313g = bottomSheetModalSize5;
        BottomSheetModalSize[] bottomSheetModalSizeArr = {bottomSheetModalSize, bottomSheetModalSize2, bottomSheetModalSize3, bottomSheetModalSize4, bottomSheetModalSize5};
        f337314h = bottomSheetModalSizeArr;
        f337315i = kotlin.enums.c.a(bottomSheetModalSizeArr);
        f337308b = new a(null);
    }

    public BottomSheetModalSize() {
        throw null;
    }

    public static BottomSheetModalSize valueOf(String str) {
        return (BottomSheetModalSize) Enum.valueOf(BottomSheetModalSize.class, str);
    }

    public static BottomSheetModalSize[] values() {
        return (BottomSheetModalSize[]) f337314h.clone();
    }
}
