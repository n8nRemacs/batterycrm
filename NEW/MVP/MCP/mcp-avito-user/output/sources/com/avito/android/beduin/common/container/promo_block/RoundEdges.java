package com.avito.android.beduin.common.container.promo_block;

import Y61.k;
import com.avito.android.lib.util.groupable_item.immutable.Edges;
import com.avito.android.remote.model.ProfileTab;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinPromoBlockModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/container/promo_block/RoundEdges;", "", "<init>", "(Ljava/lang/String;I)V", "a", "TOP", "BOTTOM", "ALL", "NONE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RoundEdges {

    @c(ProfileTab.ALL)
    public static final RoundEdges ALL;

    @c("bottom")
    public static final RoundEdges BOTTOM;

    @c("none")
    public static final RoundEdges NONE;

    @c("top")
    public static final RoundEdges TOP;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f103173b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ RoundEdges[] f103174c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f103175d;

    /* compiled from: BeduinPromoBlockModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/promo_block/RoundEdges$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: BeduinPromoBlockModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.common.container.promo_block.RoundEdges$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3095a {
            static {
                int[] iArr = new int[Edges.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Edges edges = Edges.f181360b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    Edges edges2 = Edges.f181360b;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    Edges edges3 = Edges.f181360b;
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        RoundEdges roundEdges = new RoundEdges("TOP", 0);
        TOP = roundEdges;
        RoundEdges roundEdges2 = new RoundEdges("BOTTOM", 1);
        BOTTOM = roundEdges2;
        RoundEdges roundEdges3 = new RoundEdges("ALL", 2);
        ALL = roundEdges3;
        RoundEdges roundEdges4 = new RoundEdges("NONE", 3);
        NONE = roundEdges4;
        RoundEdges[] roundEdgesArr = {roundEdges, roundEdges2, roundEdges3, roundEdges4};
        f103174c = roundEdgesArr;
        f103175d = kotlin.enums.c.a(roundEdgesArr);
        f103173b = new a(null);
    }

    private RoundEdges(String str, int i12) {
    }

    public static RoundEdges valueOf(String str) {
        return (RoundEdges) Enum.valueOf(RoundEdges.class, str);
    }

    public static RoundEdges[] values() {
        return (RoundEdges[]) f103174c.clone();
    }
}
