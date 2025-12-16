package com.avito.android.promoblock;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TnsPromoBlockItem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/promoblock/TnsPromoBlockItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Lcom/avito/android/lib/util/groupable_item/a;", "Button", "b", "Style", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface TnsPromoBlockItem extends ParcelableItem, com.avito.android.lib.util.groupable_item.a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TnsPromoBlockItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promoblock/TnsPromoBlockItem$Style;", "", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        /* renamed from: b, reason: collision with root package name */
        public static final Style f231760b;

        /* renamed from: c, reason: collision with root package name */
        public static final Style f231761c;

        /* renamed from: d, reason: collision with root package name */
        public static final Style f231762d;

        /* renamed from: e, reason: collision with root package name */
        public static final Style f231763e;

        /* renamed from: f, reason: collision with root package name */
        public static final Style f231764f;

        /* renamed from: g, reason: collision with root package name */
        public static final Style f231765g;

        /* renamed from: h, reason: collision with root package name */
        public static final Style f231766h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ Style[] f231767i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f231768j;

        static {
            Style style = new Style("WHITE", 0);
            f231760b = style;
            Style style2 = new Style("BLUE", 1);
            f231761c = style2;
            Style style3 = new Style("GREEN", 2);
            f231762d = style3;
            Style style4 = new Style("RED", 3);
            f231763e = style4;
            Style style5 = new Style("ORANGE", 4);
            f231764f = style5;
            Style style6 = new Style("BEIGE", 5);
            f231765g = style6;
            Style style7 = new Style("VIOLET", 6);
            f231766h = style7;
            Style[] styleArr = {style, style2, style3, style4, style5, style6, style7, new Style("WARMGRAY", 7)};
            f231767i = styleArr;
            f231768j = kotlin.enums.c.a(styleArr);
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f231767i.clone();
        }
    }

    /* compiled from: TnsPromoBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: TnsPromoBlockItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/promoblock/TnsPromoBlockItem$b;", "", "a", "b", "Lcom/avito/android/promoblock/TnsPromoBlockItem$b$a;", "Lcom/avito/android/promoblock/TnsPromoBlockItem$b$b;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Button f231769a;

        /* compiled from: TnsPromoBlockItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promoblock/TnsPromoBlockItem$b$a;", "Lcom/avito/android/promoblock/TnsPromoBlockItem$b;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Button f231770b;

            public a(@Y61.k Button button) {
                super(button, null);
                this.f231770b = button;
            }

            @Override // com.avito.android.promoblock.TnsPromoBlockItem.b
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final Button getF231769a() {
                return this.f231770b;
            }
        }

        /* compiled from: TnsPromoBlockItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promoblock/TnsPromoBlockItem$b$b;", "Lcom/avito/android/promoblock/TnsPromoBlockItem$b;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.promoblock.TnsPromoBlockItem$b$b, reason: collision with other inner class name */
        public static final class C7059b extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Button f231771b;

            public C7059b(@Y61.k Button button) {
                super(button, null);
                this.f231771b = button;
            }

            @Override // com.avito.android.promoblock.TnsPromoBlockItem.b
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final Button getF231769a() {
                return this.f231771b;
            }
        }

        public b(Button button, C42822w c42822w) {
            this.f231769a = button;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public Button getF231769a() {
            return this.f231769a;
        }
    }

    @Y61.l
    /* renamed from: T2 */
    Button getF224509m();

    @Y61.l
    /* renamed from: T3 */
    Button getF224508l();

    @Y61.l
    /* renamed from: getDescription */
    String getF224502f();

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    String getF229755b();

    @Y61.k
    /* renamed from: getStyle */
    Style getF224504h();

    @Y61.l
    /* renamed from: getTitle */
    String getF224501e();

    @Y61.l
    /* renamed from: l3 */
    AttributedText getF224503g();

    /* renamed from: x1 */
    boolean getF224505i();

    /* compiled from: TnsPromoBlockItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promoblock/TnsPromoBlockItem$Button;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class Button implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f231757b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f231758c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f231759d;

        /* compiled from: TnsPromoBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@Y61.k String str, @Y61.k DeepLink deepLink, boolean z12) {
            this.f231757b = str;
            this.f231758c = deepLink;
            this.f231759d = z12;
        }

        /* renamed from: c, reason: from getter */
        public boolean getF231759d() {
            return this.f231759d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Y61.k
        /* renamed from: getDeeplink, reason: from getter */
        public DeepLink getF231758c() {
            return this.f231758c;
        }

        @Y61.k
        /* renamed from: getText, reason: from getter */
        public String getF231757b() {
            return this.f231757b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f231757b);
            parcel.writeParcelable(this.f231758c, i12);
            parcel.writeInt(this.f231759d ? 1 : 0);
        }

        public /* synthetic */ Button(String str, DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? false : z12);
        }
    }
}
