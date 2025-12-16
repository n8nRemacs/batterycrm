package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivContentAlignmentVertical.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivContentAlignmentVertical;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public enum DivContentAlignmentVertical {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");


    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f371428c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<String, DivContentAlignmentVertical> f371429d = a.f371439l;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f371438b;

    /* compiled from: DivContentAlignmentVertical.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivContentAlignmentVertical;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, DivContentAlignmentVertical> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f371439l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final DivContentAlignmentVertical invoke(String str) {
            String str2 = str;
            DivContentAlignmentVertical divContentAlignmentVertical = DivContentAlignmentVertical.TOP;
            if (str2.equals("top")) {
                return divContentAlignmentVertical;
            }
            DivContentAlignmentVertical divContentAlignmentVertical2 = DivContentAlignmentVertical.CENTER;
            if (str2.equals("center")) {
                return divContentAlignmentVertical2;
            }
            DivContentAlignmentVertical divContentAlignmentVertical3 = DivContentAlignmentVertical.BOTTOM;
            if (str2.equals("bottom")) {
                return divContentAlignmentVertical3;
            }
            DivContentAlignmentVertical divContentAlignmentVertical4 = DivContentAlignmentVertical.BASELINE;
            if (str2.equals("baseline")) {
                return divContentAlignmentVertical4;
            }
            DivContentAlignmentVertical divContentAlignmentVertical5 = DivContentAlignmentVertical.SPACE_BETWEEN;
            if (str2.equals("space-between")) {
                return divContentAlignmentVertical5;
            }
            DivContentAlignmentVertical divContentAlignmentVertical6 = DivContentAlignmentVertical.SPACE_AROUND;
            if (str2.equals("space-around")) {
                return divContentAlignmentVertical6;
            }
            DivContentAlignmentVertical divContentAlignmentVertical7 = DivContentAlignmentVertical.SPACE_EVENLY;
            if (str2.equals("space-evenly")) {
                return divContentAlignmentVertical7;
            }
            return null;
        }
    }

    /* compiled from: DivContentAlignmentVertical.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivContentAlignmentVertical$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    DivContentAlignmentVertical(String str) {
        this.f371438b = str;
    }
}
