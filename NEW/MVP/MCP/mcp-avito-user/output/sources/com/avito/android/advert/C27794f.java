package com.avito.android.advert;

import android.app.Application;
import android.content.Intent;
import com.avito.android.advert.AdvertDetailsActivity;
import com.avito.android.advert.closed.ClosedAdvertActivity;
import com.avito.android.advert.cpo_program.AutotekaCpoProgramActivity;
import com.avito.android.advert.icebreakerseditor.IcebreakersEditorActivity;
import com.avito.android.advert.icebreakerseditor.analytics.IcebreakersEditorAnalyticsData;
import com.avito.android.advert.item.AdvertDetailsArguments;
import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import com.avito.android.advert.item.AdvertDetailsFragmentData;
import com.avito.android.advert.item.ClosedAdvertArguments;
import com.avito.android.advert.item.ClosedAdvertFragmentData;
import com.avito.android.advert.notes.EditAdvertNoteActivity;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.AdvertNavBarStyle;
import com.avito.android.remote.model.IceBreaker;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.autotekateaser.CpoDescription;
import com.avito.android.util.C35967w2;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdvertDetailsIntentFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/f;", "Lcom/avito/android/advert/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C27794f implements InterfaceC27793e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f71161a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.L f71162b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.navigation.a f71163c;

    /* compiled from: AdvertDetailsIntentFactoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.f$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71164a;

        static {
            int[] iArr = new int[AdvertDetailsLink.Segment.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AdvertDetailsLink.Segment segment = AdvertDetailsLink.Segment.f132963b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AdvertDetailsLink.Segment segment2 = AdvertDetailsLink.Segment.f132963b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AdvertDetailsLink.Segment segment3 = AdvertDetailsLink.Segment.f132963b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[AdvertDetailsLink.GigAction.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            f71164a = iArr2;
        }
    }

    @Inject
    public C27794f(@Y61.k Application application, @Y61.k com.avito.android.L l12, @Y61.k com.avito.android.navigation.a aVar) {
        this.f71161a = application;
        this.f71162b = l12;
        this.f71163c = aVar;
    }

    @Override // com.avito.android.advert.InterfaceC27793e
    @Y61.k
    public final Intent a(@Y61.l String str, @Y61.l BottomNavigationSpace bottomNavigationSpace) {
        NavigationTabSetItem navigationTabSetItemA = this.f71163c.a();
        if (navigationTabSetItemA != null) {
            return this.f71162b.d(new ClosedAdvertFragmentData(new ClosedAdvertArguments(str, bottomNavigationSpace), navigationTabSetItemA));
        }
        ClosedAdvertActivity.f68833m.getClass();
        Intent intent = new Intent(this.f71161a, (Class<?>) ClosedAdvertActivity.class);
        intent.putExtra("subtitle", str);
        intent.putExtra("bottom_navigation_space", bottomNavigationSpace);
        return intent;
    }

    @Override // com.avito.android.advert.InterfaceC27793e
    @Y61.k
    public final Intent b(@Y61.k List<IceBreaker> list, int i12, @Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        new IcebreakersEditorActivity.a();
        return new Intent(this.f71161a, (Class<?>) IcebreakersEditorActivity.class).putParcelableArrayListExtra("icebreakers", new ArrayList<>(list)).putExtra("icebreakersLimit", i12).putExtra("analyticsData", new IcebreakersEditorAnalyticsData(str, str2, str3));
    }

    @Override // com.avito.android.advert.InterfaceC27793e
    @Y61.k
    public final Intent c(@Y61.k String str, @Y61.l ContactBarData contactBarData, @Y61.k String str2, @Y61.l String str3, boolean z12, @Y61.l String str4) {
        Intent intent = new Intent(this.f71161a, (Class<?>) EditAdvertNoteActivity.class);
        intent.putExtra("advert_id", str);
        intent.putExtra("contact_bar_data", contactBarData);
        intent.putExtra("advert_title", str2);
        intent.putExtra("advert_note", str3);
        intent.putExtra("is_favorite", z12);
        intent.putExtra("search_context", str4);
        return intent;
    }

    @Override // com.avito.android.advert.InterfaceC27793e
    @Y61.k
    public final Intent d(@Y61.k CpoDescription cpoDescription) {
        new AutotekaCpoProgramActivity.a();
        return new Intent(this.f71161a, (Class<?>) AutotekaCpoProgramActivity.class).putExtra("cpo_program_data", cpoDescription);
    }

    @Override // com.avito.android.advert.InterfaceC27793e
    @Y61.k
    public final Intent e(@Y61.k String str, @Y61.l Integer num, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l Image image, @Y61.l String str7, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l TreeClickStreamParent treeClickStreamParent, long j12, @Y61.l Integer num2, @Y61.l NavigationTabSetItem navigationTabSetItem, @Y61.k ScreenSource screenSource, @Y61.l String str8, @Y61.k AdvertDetailsLink.Segment segment, @Y61.l String str9, @Y61.l AdvertNavBarStyle advertNavBarStyle, @Y61.l String str10, @Y61.l String str11, @Y61.l AdvertDetailsLink.GigAction gigAction) {
        AdvertDetailsStyle advertDetailsStyle;
        AdvertDetailsFastOpenParams.FromSpace fromSpace;
        AdvertDetailsFastOpenParams.GigAction gigAction2;
        int iOrdinal = segment.ordinal();
        if (iOrdinal == 0) {
            advertDetailsStyle = AdvertDetailsStyle.f84409c;
        } else if (iOrdinal == 1) {
            advertDetailsStyle = AdvertDetailsStyle.f84410d;
        } else if (iOrdinal == 2) {
            advertDetailsStyle = AdvertDetailsStyle.f84411e;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            advertDetailsStyle = AdvertDetailsStyle.f84412f;
        }
        AdvertDetailsStyle advertDetailsStyle2 = advertDetailsStyle;
        int iOrdinal2 = segment.ordinal();
        if (iOrdinal2 == 0) {
            fromSpace = AdvertDetailsFastOpenParams.FromSpace.f71338d;
        } else if (iOrdinal2 == 1) {
            fromSpace = AdvertDetailsFastOpenParams.FromSpace.f71339e;
        } else if (iOrdinal2 == 2) {
            fromSpace = AdvertDetailsFastOpenParams.FromSpace.f71340f;
        } else {
            if (iOrdinal2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fromSpace = AdvertDetailsFastOpenParams.FromSpace.f71341g;
        }
        AdvertDetailsFastOpenParams.FromSpace fromSpace2 = fromSpace;
        if (gigAction == null) {
            gigAction2 = null;
        } else {
            if (a.f71164a[gigAction.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            gigAction2 = AdvertDetailsFastOpenParams.GigAction.f71346b;
        }
        AdvertDetailsFastOpenParams.GigAction gigAction3 = gigAction2;
        if (navigationTabSetItem != null) {
            NavigationScreenAction navigationScreenAction = null;
            int i12 = 4;
            return this.f71162b.d(new AdvertDetailsFragmentData(new AdvertDetailsArguments(str, num, str2, new AdvertDetailsFastOpenParams(str3, str4, str5, str6, image, str7, bool2, advertDetailsStyle2, bool, fromSpace2, str10, new AdvertDetailsFastOpenParams.GigParams(str11, gigAction3), advertNavBarStyle), treeClickStreamParent, j12, num2, screenSource, str9, null, str8, null, null, 6144, null), navigationTabSetItem, navigationScreenAction, i12, null));
        }
        new AdvertDetailsActivity.a();
        Intent intentPutExtra = new Intent(this.f71161a, (Class<?>) AdvertDetailsActivity.class).putExtra("advert_id", str).putExtra("address_id", num).putExtra("advert_context", str2).putExtra("fast_open_params", new AdvertDetailsFastOpenParams(str3, str4, str5, str6, image, str7, bool2, advertDetailsStyle2, bool, fromSpace2, str10, new AdvertDetailsFastOpenParams.GigParams(str11, gigAction3), advertNavBarStyle)).putExtra("serp_gallery_position", num2).putExtra("advert_click_time", j12).putExtra("advert_screen_source", screenSource);
        if (str9 != null) {
            intentPutExtra.putExtra("call_id_for_emit_call", str9);
        }
        if (str8 != null) {
            intentPutExtra.putExtra("selected_page_for_stories", str8);
        }
        if (treeClickStreamParent == null) {
            return intentPutExtra;
        }
        C35967w2.b(intentPutExtra, treeClickStreamParent);
        return intentPutExtra;
    }
}
