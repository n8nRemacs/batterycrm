package com.avito.android.inline_filters.dialog.location_group;

import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.inline_filters.dialog.InlineFilterDialogOpener;
import com.avito.android.inline_filters.dialog.location_group.adapter.GroupFilterItem;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.WidgetType;
import io.reactivex.rxjava3.internal.operators.observable.C41962k;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: LocationGroupFilterDialog.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/inline_filters/dialog/location_group/adapter/GroupFilterItem;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "it", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class w<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31013b f171843b;

    /* compiled from: LocationGroupFilterDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171844a;

        static {
            int[] iArr = new int[WidgetType.values().length];
            try {
                iArr[WidgetType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetType.Radius.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetType.Chips.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetType.Metro.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WidgetType.District.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WidgetType.Direction.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WidgetType.LocalPriority.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WidgetType.SuggestLocation.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f171844a = iArr;
        }
    }

    public w(C31013b c31013b) {
        this.f171843b = c31013b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        SearchParams searchParams;
        PresentationType presentationType;
        String str;
        SearchParams searchParams2;
        SearchParams searchParams3;
        Q q12 = (Q) obj;
        GroupFilterItem groupFilterItem = (GroupFilterItem) q12.f406619b;
        InlineFilterValue inlineFilterValue = (InlineFilterValue) q12.f406620c;
        Filter.Widget widget = groupFilterItem.f171704c.getWidget();
        WidgetType type = widget != null ? widget.getType() : null;
        int i12 = type == null ? -1 : a.f171844a[type.ordinal()];
        C31013b c31013b = this.f171843b;
        CN.f fVar = c31013b.f171795k;
        switch (i12) {
            case 1:
            case 2:
            case 3:
                if (inlineFilterValue != null) {
                    c31013b.f171807w.post(new Me.m(c31013b, groupFilterItem, inlineFilterValue, 19));
                    break;
                }
                break;
            case 4:
                C41962k c41962k = c31013b.f171809y;
                if (c41962k != null) {
                    c41962k.u0(new C31024m(c31013b, groupFilterItem), C31025n.f171832b);
                    break;
                }
                break;
            case 5:
                C41962k c41962k2 = c31013b.f171778A;
                if (c41962k2 != null) {
                    c41962k2.u0(new q(c31013b, groupFilterItem), r.f171837b);
                    break;
                }
                break;
            case 6:
                C41962k c41962k3 = c31013b.f171810z;
                if (c41962k3 != null) {
                    c41962k3.u0(new u(c31013b, groupFilterItem), v.f171842b);
                    break;
                }
                break;
            case 7:
                if (inlineFilterValue != null) {
                    Filter filter = groupFilterItem.f171704c;
                    ItemsSearchLink itemsSearchLink = c31013b.f171781D;
                    if (itemsSearchLink == null || (searchParams = itemsSearchLink.f133403b) == null) {
                        searchParams = c31013b.f171779B;
                    }
                    SearchParams searchParams4 = searchParams;
                    if (itemsSearchLink == null || (presentationType = itemsSearchLink.f133413l) == null) {
                        presentationType = c31013b.f171796l;
                    }
                    PresentationType presentationType2 = presentationType;
                    if (itemsSearchLink == null || (str = itemsSearchLink.f133404c) == null) {
                        str = c31013b.f171797m;
                    }
                    c31013b.g(filter, inlineFilterValue, searchParams4, presentationType2, str);
                    if (fVar != null) {
                        ItemsSearchLink itemsSearchLink2 = c31013b.f171781D;
                        if (itemsSearchLink2 == null || (searchParams2 = itemsSearchLink2.f133403b) == null) {
                            searchParams2 = c31013b.f171779B;
                        }
                        fVar.o(searchParams2, groupFilterItem.f171704c, inlineFilterValue);
                        break;
                    }
                }
                break;
            case 8:
                C31013b.f(c31013b, groupFilterItem, InlineFilterDialogOpener.Source.f171143d);
                break;
            default:
                C31013b.f(c31013b, groupFilterItem, c31013b.f171798n);
                break;
        }
        if (fVar != null) {
            ItemsSearchLink itemsSearchLink3 = c31013b.f171781D;
            if (itemsSearchLink3 == null || (searchParams3 = itemsSearchLink3.f133403b) == null) {
                searchParams3 = c31013b.f171779B;
            }
            fVar.n(searchParams3, groupFilterItem.f171704c);
        }
        c31013b.k();
    }
}
