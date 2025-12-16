package com.avito.android.shortcut_navigation_bar.adapter;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilterValueKt;
import com.avito.android.remote.model.search.InlineFiltersKt;
import com.avito.android.remote.model.search.WidgetType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShortcutNavigationItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/InlineFilterNavigationItem;", "Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class InlineFilterNavigationItem extends ShortcutNavigationItem {

    @k
    public static final Parcelable.Creator<InlineFilterNavigationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f283227b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f283228c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Object f283229d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f283230e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f283231f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Filter f283232g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public String f283233h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f283234i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f283235j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public Filter.InnerOptions.State f283236k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public Filter.InnerOptions.State f283237l;

    /* compiled from: ShortcutNavigationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InlineFilterNavigationItem> {
        @Override // android.os.Parcelable.Creator
        public final InlineFilterNavigationItem createFromParcel(Parcel parcel) {
            return new InlineFilterNavigationItem(parcel.readString(), parcel.readString(), parcel.readValue(InlineFilterNavigationItem.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(InlineFilterNavigationItem.class.getClassLoader()), (Filter) parcel.readParcelable(InlineFilterNavigationItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final InlineFilterNavigationItem[] newArray(int i12) {
            return new InlineFilterNavigationItem[i12];
        }
    }

    /* compiled from: ShortcutNavigationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f283238a;

        static {
            int[] iArr = new int[WidgetType.values().length];
            try {
                iArr[WidgetType.Checkbox.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetType.RadioSelect.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetType.Group.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetType.Beduin.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WidgetType.GuestsSelect.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WidgetType.Quarters.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f283238a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InlineFilterNavigationItem(String str, String str2, Object obj, String str3, DeepLink deepLink, Filter filter, String str4, boolean z12, boolean z13, int i12, C42822w c42822w) {
        boolean zBooleanValue;
        Boolean boolIsHighlighted;
        if ((i12 & 128) != 0) {
            zBooleanValue = (filter == null || (boolIsHighlighted = filter.isHighlighted()) == null) ? false : boolIsHighlighted.booleanValue();
        } else {
            zBooleanValue = z12;
        }
        this(str, str2, obj, str3, deepLink, filter, str4, zBooleanValue, (i12 & 256) != 0 ? false : z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem
    @l
    /* renamed from: getDeepLink, reason: from getter */
    public DeepLink getF283216d() {
        return this.f283231f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public String getF270098b() {
        return this.f283227b;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem
    @k
    /* renamed from: getText, reason: from getter */
    public String getF283215c() {
        return this.f283230e;
    }

    public final boolean isSelected() {
        Filter.Widget widget;
        Filter filter = this.f283232g;
        WidgetType type = (filter == null || (widget = filter.getWidget()) == null) ? null : widget.getType();
        switch (type == null ? -1 : b.f283238a[type.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return this.f283234i;
            default:
                Object obj = this.f283229d;
                if (!(obj instanceof InlineFilterValue.InlineFilterShortcutValue) && (obj instanceof InlineFilterValue)) {
                    return InlineFilterValueKt.isNotEmpty((InlineFilterValue) obj);
                }
                return false;
        }
    }

    public void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f283227b);
        parcel.writeString(this.f283228c);
        parcel.writeValue(this.f283229d);
        parcel.writeString(this.f283230e);
        parcel.writeParcelable(this.f283231f, i12);
        parcel.writeParcelable(this.f283232g, i12);
        parcel.writeString(this.f283233h);
        parcel.writeInt(this.f283234i ? 1 : 0);
        parcel.writeInt(this.f283235j ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public InlineFilterNavigationItem(@k String str, @k String str2, @l Object obj, @k String str3, @l DeepLink deepLink, @l Filter filter, @l String str4, boolean z12, boolean z13) {
        Filter.InnerOptions.Options optionsFirstOption;
        Filter.InnerOptions.State newState = 0;
        newState = 0;
        newState = 0;
        newState = 0;
        super(newState);
        this.f283227b = str;
        this.f283228c = str2;
        this.f283229d = obj;
        this.f283230e = str3;
        this.f283231f = deepLink;
        this.f283232g = filter;
        this.f283233h = str4;
        this.f283234i = z12;
        this.f283235j = z13;
        this.f283236k = new Filter.InnerOptions.State(this.f283233h, Boolean.valueOf(this.f283234i));
        List<Filter.InnerOptions> options = filter != null ? filter.getOptions() : null;
        if (options != null && !options.isEmpty() && filter != null && (optionsFirstOption = InlineFiltersKt.firstOption(filter)) != null) {
            newState = optionsFirstOption.getNewState();
        }
        this.f283237l = newState;
    }
}
