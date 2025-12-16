package com.avito.android.remote.model;

import X41.f;
import Y61.k;
import Y61.l;
import aW.InterfaceC19825c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.o1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonuses;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.avito.android.remote.model.hotel.HotelRating;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.price_list.PriceList;
import com.avito.android.remote.model.realtor_bonus.RealtorBonus;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.remote.model.section.SectionElement;
import com.avito.android.remote.model.serp.SerpAdvertSpecification;
import com.avito.android.remote.model.serp.SerpSellerVerification;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.short_term_rent.StrRatingAndReviews;
import com.avito.android.remote.model.snippet_type.SnippetType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.parse.adapter.stream_gson.AttributedTextTypeAdapterFactory;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import com.avito.android.util.J3;
import com.google.gson.annotations.b;
import com.google.gson.annotations.c;
import com.google.gson.i;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import shark.AndroidResourceIdNames;

/* compiled from: SerpAdvert.kt */
@InterfaceC19825c
@Metadata(d1 = {"\u0000Ã\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b¦\u0001\b\u0017\u0018\u0000 §\u00022\u00020\u00012\u00020\u00022\u00020\u0003:\u0002§\u0002Bå\u0006\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u00100\u001a\u00020/\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010/\u0012\b\u00102\u001a\u0004\u0018\u00010/\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000105\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\u000e\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u001d\u0012\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u001d\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010A\u001a\u0004\u0018\u00010@\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\b\u0010E\u001a\u0004\u0018\u00010D\u0012\b\u0010G\u001a\u0004\u0018\u00010F\u0012\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010\u001d\u0012\b\u0010K\u001a\u0004\u0018\u00010J\u0012\b\u0010M\u001a\u0004\u0018\u00010L\u0012\b\u0010O\u001a\u0004\u0018\u00010N\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010P\u0012\b\u0010R\u001a\u0004\u0018\u00010/\u0012\b\u0010S\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d\u0012\b\u0010V\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010W\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010Y\u001a\u0004\u0018\u00010X\u0012\u0006\u0010Z\u001a\u00020/\u0012\b\u0010[\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010]\u001a\u0004\u0018\u00010\\\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010_\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010c\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010e\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010g\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010i\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010k\u0012\n\b\u0002\u0010n\u001a\u0004\u0018\u00010m\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010q\u001a\u0004\u0018\u00010p\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010r\u0012\n\b\u0002\u0010u\u001a\u0004\u0018\u00010t\u0012\n\b\u0002\u0010v\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u0010w\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u0010x\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u0010z\u001a\u0004\u0018\u00010y\u0012\n\b\u0002\u0010|\u001a\u0004\u0018\u00010{¢\u0006\u0004\b}\u0010~J%\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0080\u0001\u001a\u00020\u007f2\u0007\u0010\u0081\u0001\u001a\u00020XH\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0012\u0010\u0085\u0001\u001a\u00020XH\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001d\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0005\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0006\u0010\u0087\u0001\u001a\u0006\b\u008a\u0001\u0010\u0089\u0001R\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0007\u0010\u0087\u0001\u001a\u0006\b\u008b\u0001\u0010\u0089\u0001R\u001f\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\b\u0010\u0087\u0001\u001a\u0006\b\u008c\u0001\u0010\u0089\u0001R\u001f\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\n\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001f\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\f\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001f\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\r\u0010\u0087\u0001\u001a\u0006\b\u0093\u0001\u0010\u0089\u0001R\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u000f\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0011\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0012\u0010\u0087\u0001\u001a\u0006\b\u009a\u0001\u0010\u0089\u0001R\u001d\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0013\u0010\u0087\u0001\u001a\u0006\b\u009b\u0001\u0010\u0089\u0001R\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0014\u0010\u0087\u0001\u001a\u0006\b\u009c\u0001\u0010\u0089\u0001R\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0015\u0010\u0087\u0001\u001a\u0006\b\u009d\u0001\u0010\u0089\u0001R\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0017\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u0019\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u001a\u0010¡\u0001\u001a\u0006\b¤\u0001\u0010£\u0001R\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u001c\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R%\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u001e\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u001f\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b \u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001f\u0010!\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b!\u0010\u0087\u0001\u001a\u0006\b®\u0001\u0010\u0089\u0001R\u001f\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\"\u0010\u0087\u0001\u001a\u0006\b¯\u0001\u0010\u0089\u0001R\u001f\u0010#\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b#\u0010\u0087\u0001\u001a\u0006\b°\u0001\u0010\u0089\u0001R\u001f\u0010$\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b$\u0010\u0087\u0001\u001a\u0006\b±\u0001\u0010\u0089\u0001R\u001f\u0010%\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b%\u0010\u0087\u0001\u001a\u0006\b²\u0001\u0010\u0089\u0001R\u001f\u0010&\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b&\u0010\u0087\u0001\u001a\u0006\b³\u0001\u0010\u0089\u0001R\u001f\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b(\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R\u001f\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b*\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R\u001f\u0010+\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b+\u0010\u0087\u0001\u001a\u0006\bº\u0001\u0010\u0089\u0001R\u001f\u0010-\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b-\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R\u001f\u0010.\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b.\u0010\u0087\u0001\u001a\u0006\b¾\u0001\u0010\u0089\u0001R\u001c\u00100\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b0\u0010¿\u0001\u001a\u0005\b0\u0010À\u0001R\u001e\u00101\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b1\u0010Á\u0001\u001a\u0005\b1\u0010Â\u0001R\u001e\u00102\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b2\u0010Á\u0001\u001a\u0005\b2\u0010Â\u0001R\u001f\u00104\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b4\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R+\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b6\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R\u001f\u00108\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b8\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001R%\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b:\u0010¨\u0001\u001a\u0006\bÌ\u0001\u0010ª\u0001R%\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b<\u0010¨\u0001\u001a\u0006\bÍ\u0001\u0010ª\u0001R\u001f\u0010>\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b>\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u001f\u0010?\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b?\u0010\u0087\u0001\u001a\u0006\bÑ\u0001\u0010\u0089\u0001R\u001f\u0010A\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bA\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u001f\u0010C\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bC\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001R\u001f\u0010E\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bE\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u001f\u0010G\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bG\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001R%\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bI\u0010¨\u0001\u001a\u0006\bÞ\u0001\u0010ª\u0001R\u001f\u0010K\u001a\u0004\u0018\u00010J8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bK\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001R\u001f\u0010M\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bM\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001R\u001f\u0010O\u001a\u0004\u0018\u00010N8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bO\u0010å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001R\u001f\u0010Q\u001a\u0004\u0018\u00010P8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bQ\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001R\u001f\u0010R\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bR\u0010Á\u0001\u001a\u0006\bë\u0001\u0010Â\u0001R\u001f\u0010S\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bS\u0010Á\u0001\u001a\u0006\bì\u0001\u0010Â\u0001R\u001f\u0010T\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bT\u0010\u0087\u0001\u001a\u0006\bí\u0001\u0010\u0089\u0001R%\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bU\u0010¨\u0001\u001a\u0006\bî\u0001\u0010ª\u0001R\u001f\u0010V\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bV\u0010\u0087\u0001\u001a\u0006\bï\u0001\u0010\u0089\u0001R\u001f\u0010W\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bW\u0010\u0087\u0001\u001a\u0006\bð\u0001\u0010\u0089\u0001R\u001f\u0010Y\u001a\u0004\u0018\u00010X8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bY\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001R\u001d\u0010Z\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bZ\u0010¿\u0001\u001a\u0006\bô\u0001\u0010À\u0001R\u001f\u0010[\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b[\u0010\u0087\u0001\u001a\u0006\bõ\u0001\u0010\u0089\u0001R\u001f\u0010]\u001a\u0004\u0018\u00010\\8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b]\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001R\u001f\u0010^\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b^\u0010Á\u0001\u001a\u0006\bù\u0001\u0010Â\u0001R\u001f\u0010`\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b`\u0010ú\u0001\u001a\u0006\bû\u0001\u0010ü\u0001R\u001f\u0010a\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\ba\u0010Á\u0001\u001a\u0006\bý\u0001\u0010Â\u0001R\u001f\u0010b\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bb\u0010Á\u0001\u001a\u0006\bþ\u0001\u0010Â\u0001R\u001f\u0010d\u001a\u0004\u0018\u00010c8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bd\u0010ÿ\u0001\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002R\u001f\u0010f\u001a\u0004\u0018\u00010e8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bf\u0010\u0082\u0002\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002R\u001f\u0010h\u001a\u0004\u0018\u00010g8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bh\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R\u001f\u0010j\u001a\u0004\u0018\u00010i8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bj\u0010\u0088\u0002\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002R\u001f\u0010l\u001a\u0004\u0018\u00010k8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bl\u0010\u008b\u0002\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R\u001f\u0010n\u001a\u0004\u0018\u00010m8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bn\u0010\u008e\u0002\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002R\u001f\u0010o\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bo\u0010\u0087\u0001\u001a\u0006\b\u0091\u0002\u0010\u0089\u0001R\u001f\u0010q\u001a\u0004\u0018\u00010p8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bq\u0010\u0092\u0002\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R\u001f\u0010s\u001a\u0004\u0018\u00010r8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bs\u0010\u0095\u0002\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R\u001f\u0010u\u001a\u0004\u0018\u00010t8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bu\u0010\u0098\u0002\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002R\u001e\u0010v\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bv\u0010Á\u0001\u001a\u0005\bv\u0010Â\u0001R\u001e\u0010w\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bw\u0010Á\u0001\u001a\u0005\bw\u0010Â\u0001R\u001e\u0010x\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bx\u0010Á\u0001\u001a\u0005\bx\u0010Â\u0001R\u001f\u0010z\u001a\u0004\u0018\u00010y8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bz\u0010\u009b\u0002\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002R\u001f\u0010|\u001a\u0004\u0018\u00010{8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b|\u0010\u009e\u0002\u001a\u0006\b\u009f\u0002\u0010 \u0002R)\u0010¡\u0002\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b¡\u0002\u0010¢\u0002\u001a\u0006\b£\u0002\u0010¤\u0002\"\u0006\b¥\u0002\u0010¦\u0002¨\u0006¨\u0002"}, d2 = {"Lcom/avito/android/remote/model/SerpAdvert;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/section/SectionElement;", "", "id", AddressParameter.TYPE, "addressesAdditionalInfo", "location", "Lcom/google/gson/i;", NotificationsSettings.Section.SECTION_DELIVERY, "Lcom/avito/android/remote/model/DeliveryTerms;", "deliveryTerms", "distance", "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "", CrashHianalyticsData.TIME, "formattedTime", "title", "description", "userType", "Lcom/avito/android/remote/model/AdvertImage;", "image", "Lcom/avito/android/remote/model/NameIdEntity;", "category", "shop", "Lcom/avito/android/remote/model/serp/SerpSellerVerification;", "verification", "", "services", "Lcom/avito/android/remote/model/UniversalColor;", "highlightColor", "schedule", "price", "normalizedPrice", "priceWithoutDiscount", "previousPrice", "previousPriceHint", "Lcom/avito/android/remote/model/DiscountIcon;", "discountIcon", "Lcom/avito/android/remote/model/price_list/PriceList;", "priceList", "priceSubtitle", "Lcom/avito/android/remote/model/Video;", "video", "status", "", "isFavorite", "isFavoriteVisible", "isVerifiedSeller", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "analyticParams", "Lcom/avito/android/remote/model/SerpAdvertStr;", "shortTermRent", "Lcom/avito/android/remote/model/DimmedImage;", "imageList", "Lcom/avito/android/remote/model/ConstructorAdvertGalleryItemModel;", "galleryItems", "Lcom/avito/android/remote/model/Action;", "additionalAction", "additionalName", "Lcom/avito/android/remote/model/LegacySerpAdvertBadge;", "badge", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "Lcom/avito/android/remote/model/AdvertItemActions;", "moreActions", "Lcom/avito/android/remote/model/AdvertActions;", "contacts", "Lcom/avito/android/remote/model/GeoReference;", "geoReferences", "Lcom/avito/android/remote/model/QuorumFilterInfo;", "quorumFilterInfo", "Lcom/avito/android/remote/model/RadiusInfo;", "radiusInfo", "Lcom/avito/android/remote/model/AdvertSellerInfo;", "sellerInfo", "Lcom/avito/android/remote/model/GigShiftInfo;", "gigShiftInfo", "hasRealtyLayout", "hasVideo", "nativeVideoABCategory", "exposureParams", "inStock", "trustFactor", "", SearchParamsConverterKt.LOCATION_ID, "hidesViewedBadge", "xHash", "Lcom/avito/android/remote/model/serp/SerpAdvertSpecification;", "specification", "reserved", "Lcom/avito/android/remote/model/text/AttributedText;", "cvDescription", "hasDiscount", "trackVacanciesSurvey", "Lcom/avito/android/remote/model/realtor_bonus/RealtorBonus;", "realtorBonus", "Lcom/avito/android/remote/model/sales/utils/BadgeSticker;", "badgeSticker", "Lcom/avito/android/remote/model/snippet_type/SnippetType;", "snippetType", "Lcom/avito/android/remote/model/BuyWithDeliveryButton;", "buyWithDeliveryButton", "Lcom/avito/android/remote/model/KeyAttributes;", "keyAttributes", "Lcom/avito/android/remote/model/buyer_bonuses/BuyerBonuses;", "buyerBonuses", DateRangeParameter.TYPE, "Lcom/avito/android/remote/model/hotel/HotelRating;", "hotelRating", "Lcom/avito/android/remote/model/GeoDistance;", "geoDistance", "Lcom/avito/android/remote/model/short_term_rent/StrRatingAndReviews;", "ratingAndReviews", "isStrRedesign", "isRedesign", "isExtendedGallery", "Lcom/avito/android/remote/model/TravelInstallments;", "travelInstallments", "Lcom/avito/android/remote/model/AdvertTravelPriceVersion;", "travelPriceVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/i;Lcom/avito/android/remote/model/DeliveryTerms;Ljava/lang/String;Lcom/avito/android/remote/model/Coordinates;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertImage;Lcom/avito/android/remote/model/NameIdEntity;Lcom/avito/android/remote/model/NameIdEntity;Lcom/avito/android/remote/model/serp/SerpSellerVerification;Ljava/util/List;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/DiscountIcon;Lcom/avito/android/remote/model/price_list/PriceList;Ljava/lang/String;Lcom/avito/android/remote/model/Video;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/Map;Lcom/avito/android/remote/model/SerpAdvertStr;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/Action;Ljava/lang/String;Lcom/avito/android/remote/model/LegacySerpAdvertBadge;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Lcom/avito/android/remote/model/AdvertItemActions;Lcom/avito/android/remote/model/AdvertActions;Ljava/util/List;Lcom/avito/android/remote/model/QuorumFilterInfo;Lcom/avito/android/remote/model/RadiusInfo;Lcom/avito/android/remote/model/AdvertSellerInfo;Lcom/avito/android/remote/model/GigShiftInfo;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Lcom/avito/android/remote/model/serp/SerpAdvertSpecification;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/realtor_bonus/RealtorBonus;Lcom/avito/android/remote/model/sales/utils/BadgeSticker;Lcom/avito/android/remote/model/snippet_type/SnippetType;Lcom/avito/android/remote/model/BuyWithDeliveryButton;Lcom/avito/android/remote/model/KeyAttributes;Lcom/avito/android/remote/model/buyer_bonuses/BuyerBonuses;Ljava/lang/String;Lcom/avito/android/remote/model/hotel/HotelRating;Lcom/avito/android/remote/model/GeoDistance;Lcom/avito/android/remote/model/short_term_rent/StrRatingAndReviews;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/TravelInstallments;Lcom/avito/android/remote/model/AdvertTravelPriceVersion;)V", "Landroid/os/Parcel;", "dest", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getAddress", "getAddressesAdditionalInfo", "getLocation", "Lcom/google/gson/i;", "getDelivery", "()Lcom/google/gson/i;", "Lcom/avito/android/remote/model/DeliveryTerms;", "getDeliveryTerms", "()Lcom/avito/android/remote/model/DeliveryTerms;", "getDistance", "Lcom/avito/android/remote/model/Coordinates;", "getCoordinates", "()Lcom/avito/android/remote/model/Coordinates;", "Ljava/lang/Long;", "getTime", "()Ljava/lang/Long;", "getFormattedTime", "getTitle", "getDescription", "getUserType", "Lcom/avito/android/remote/model/AdvertImage;", "getImage", "()Lcom/avito/android/remote/model/AdvertImage;", "Lcom/avito/android/remote/model/NameIdEntity;", "getCategory", "()Lcom/avito/android/remote/model/NameIdEntity;", "getShop", "Lcom/avito/android/remote/model/serp/SerpSellerVerification;", "getVerification", "()Lcom/avito/android/remote/model/serp/SerpSellerVerification;", "Ljava/util/List;", "getServices", "()Ljava/util/List;", "Lcom/avito/android/remote/model/UniversalColor;", "getHighlightColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getSchedule", "getPrice", "getNormalizedPrice", "getPriceWithoutDiscount", "getPreviousPrice", "getPreviousPriceHint", "Lcom/avito/android/remote/model/DiscountIcon;", "getDiscountIcon", "()Lcom/avito/android/remote/model/DiscountIcon;", "Lcom/avito/android/remote/model/price_list/PriceList;", "getPriceList", "()Lcom/avito/android/remote/model/price_list/PriceList;", "getPriceSubtitle", "Lcom/avito/android/remote/model/Video;", "getVideo", "()Lcom/avito/android/remote/model/Video;", "getStatus", "Z", "()Z", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/Map;", "getAnalyticParams", "()Ljava/util/Map;", "Lcom/avito/android/remote/model/SerpAdvertStr;", "getShortTermRent", "()Lcom/avito/android/remote/model/SerpAdvertStr;", "getImageList", "getGalleryItems", "Lcom/avito/android/remote/model/Action;", "getAdditionalAction", "()Lcom/avito/android/remote/model/Action;", "getAdditionalName", "Lcom/avito/android/remote/model/LegacySerpAdvertBadge;", "getBadge", "()Lcom/avito/android/remote/model/LegacySerpAdvertBadge;", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "getBadgeBar", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "Lcom/avito/android/remote/model/AdvertItemActions;", "getMoreActions", "()Lcom/avito/android/remote/model/AdvertItemActions;", "Lcom/avito/android/remote/model/AdvertActions;", "getContacts", "()Lcom/avito/android/remote/model/AdvertActions;", "getGeoReferences", "Lcom/avito/android/remote/model/QuorumFilterInfo;", "getQuorumFilterInfo", "()Lcom/avito/android/remote/model/QuorumFilterInfo;", "Lcom/avito/android/remote/model/RadiusInfo;", "getRadiusInfo", "()Lcom/avito/android/remote/model/RadiusInfo;", "Lcom/avito/android/remote/model/AdvertSellerInfo;", "getSellerInfo", "()Lcom/avito/android/remote/model/AdvertSellerInfo;", "Lcom/avito/android/remote/model/GigShiftInfo;", "getGigShiftInfo", "()Lcom/avito/android/remote/model/GigShiftInfo;", "getHasRealtyLayout", "getHasVideo", "getNativeVideoABCategory", "getExposureParams", "getInStock", "getTrustFactor", "Ljava/lang/Integer;", "getLocationId", "()Ljava/lang/Integer;", "getHidesViewedBadge", "getXHash", "Lcom/avito/android/remote/model/serp/SerpAdvertSpecification;", "getSpecification", "()Lcom/avito/android/remote/model/serp/SerpAdvertSpecification;", "getReserved", "Lcom/avito/android/remote/model/text/AttributedText;", "getCvDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "getHasDiscount", "getTrackVacanciesSurvey", "Lcom/avito/android/remote/model/realtor_bonus/RealtorBonus;", "getRealtorBonus", "()Lcom/avito/android/remote/model/realtor_bonus/RealtorBonus;", "Lcom/avito/android/remote/model/sales/utils/BadgeSticker;", "getBadgeSticker", "()Lcom/avito/android/remote/model/sales/utils/BadgeSticker;", "Lcom/avito/android/remote/model/snippet_type/SnippetType;", "getSnippetType", "()Lcom/avito/android/remote/model/snippet_type/SnippetType;", "Lcom/avito/android/remote/model/BuyWithDeliveryButton;", "getBuyWithDeliveryButton", "()Lcom/avito/android/remote/model/BuyWithDeliveryButton;", "Lcom/avito/android/remote/model/KeyAttributes;", "getKeyAttributes", "()Lcom/avito/android/remote/model/KeyAttributes;", "Lcom/avito/android/remote/model/buyer_bonuses/BuyerBonuses;", "getBuyerBonuses", "()Lcom/avito/android/remote/model/buyer_bonuses/BuyerBonuses;", "getDateRange", "Lcom/avito/android/remote/model/hotel/HotelRating;", "getHotelRating", "()Lcom/avito/android/remote/model/hotel/HotelRating;", "Lcom/avito/android/remote/model/GeoDistance;", "getGeoDistance", "()Lcom/avito/android/remote/model/GeoDistance;", "Lcom/avito/android/remote/model/short_term_rent/StrRatingAndReviews;", "getRatingAndReviews", "()Lcom/avito/android/remote/model/short_term_rent/StrRatingAndReviews;", "Lcom/avito/android/remote/model/TravelInstallments;", "getTravelInstallments", "()Lcom/avito/android/remote/model/TravelInstallments;", "Lcom/avito/android/remote/model/AdvertTravelPriceVersion;", "getTravelPriceVersion", "()Lcom/avito/android/remote/model/AdvertTravelPriceVersion;", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes17.dex */
public class SerpAdvert implements Parcelable, SerpElement, SectionElement {

    @f
    @k
    public static final Parcelable.Creator<SerpAdvert> CREATOR;

    @c("additionalAction")
    @l
    private final Action additionalAction;

    @c("additionalName")
    @l
    private final String additionalName;

    @c(AddressParameter.TYPE)
    @l
    private final String address;

    @c("addressesAdditionalInfo")
    @l
    private final String addressesAdditionalInfo;

    @c("analyticParams")
    @l
    private final Map<String, String> analyticParams;

    @c("badge")
    @l
    private final LegacySerpAdvertBadge badge;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR)
    @l
    private final SerpBadgeBar badgeBar;

    @c("badgeSticker")
    @l
    private final BadgeSticker badgeSticker;

    @c("buyButton")
    @l
    private final BuyWithDeliveryButton buyWithDeliveryButton;

    @c("buyerBonuses")
    @l
    private final BuyerBonuses buyerBonuses;

    @c("category")
    @l
    private final NameIdEntity category;

    @c("contacts")
    @l
    private final AdvertActions contacts;

    @c("coords")
    @l
    private final Coordinates coordinates;

    @c("cvDescription")
    @l
    @b(AttributedTextTypeAdapterFactory.class)
    private final AttributedText cvDescription;

    @c(DateRangeParameter.TYPE)
    @l
    private final String dateRange;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink deepLink;

    @c(NotificationsSettings.Section.SECTION_DELIVERY)
    @l
    private final i delivery;

    @c("deliveryTerms")
    @l
    private final DeliveryTerms deliveryTerms;

    @c("description")
    @l
    private final String description;

    @c("discountIcon")
    @l
    private final DiscountIcon discountIcon;

    @c("distance")
    @l
    private final String distance;

    @c("abExposureParams")
    @l
    private final List<String> exposureParams;

    @c("formattedTime")
    @l
    private final String formattedTime;

    @c("galleryItems")
    @l
    private final List<ConstructorAdvertGalleryItemModel> galleryItems;

    @c("geoDistance")
    @l
    private final GeoDistance geoDistance;

    @c("geoReferences")
    @l
    private final List<GeoReference> geoReferences;

    @c("gigShiftInfo")
    @l
    private final GigShiftInfo gigShiftInfo;

    @c("hasDiscount")
    @l
    private final Boolean hasDiscount;

    @c("hasRealtyLayout")
    @l
    private final Boolean hasRealtyLayout;

    @c("hasVideo")
    @l
    private final Boolean hasVideo;

    @c("hidesSeenBadge")
    private final boolean hidesViewedBadge;

    @c("highlightColor")
    @l
    private final UniversalColor highlightColor;

    @c("hotelStars")
    @l
    private final HotelRating hotelRating;

    @c("id")
    @k
    private final String id;

    @c("images")
    @l
    private final AdvertImage image;

    @c("imageList")
    @l
    private final List<DimmedImage> imageList;

    @c("marketplaceSnippetInfo")
    @l
    private final String inStock;

    @c("isExtendedGallery")
    @l
    private final Boolean isExtendedGallery;

    @c("isFavorite")
    private final boolean isFavorite;

    @c("isFavoriteVisible")
    @l
    private final Boolean isFavoriteVisible;

    @c("isRedesign")
    @l
    private final Boolean isRedesign;

    @c("isStrRedesign")
    @l
    private final Boolean isStrRedesign;

    @c("isVerified")
    @l
    private final Boolean isVerifiedSeller;

    @c("keyAttributes")
    @l
    private final KeyAttributes keyAttributes;

    @c("location")
    @l
    private final String location;

    @c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final Integer locationId;

    @c("moreActions")
    @l
    private final AdvertItemActions moreActions;

    @c("nativeVideoAbCategory")
    @l
    private final String nativeVideoABCategory;

    @c("normalizedPrice")
    @l
    private final String normalizedPrice;

    @c("previousPrice")
    @l
    private final String previousPrice;

    @c("previousPriceHint")
    @l
    private final String previousPriceHint;

    @c("price")
    @l
    private final String price;

    @c("priceList")
    @l
    private final PriceList priceList;

    @c("priceSubtitle")
    @l
    private final String priceSubtitle;

    @c("priceWithoutDiscount")
    @l
    private final String priceWithoutDiscount;

    @c("quorumFilterInfo")
    @l
    private final QuorumFilterInfo quorumFilterInfo;

    @c("radiusInfo")
    @l
    private final RadiusInfo radiusInfo;

    @c("ratingAndReviews")
    @l
    private final StrRatingAndReviews ratingAndReviews;

    @c("realtorBonus")
    @l
    private final RealtorBonus realtorBonus;

    @c("isReserved")
    @l
    private final Boolean reserved;

    @c("schedule")
    @l
    private final String schedule;

    @c("sellerInfo")
    @l
    private final AdvertSellerInfo sellerInfo;

    @c("services")
    @l
    private final List<String> services;

    @c("shop")
    @l
    private final NameIdEntity shop;

    @c("shortTermRent")
    @l
    private final SerpAdvertStr shortTermRent;

    @c("snippetType")
    @l
    private final SnippetType snippetType;

    @c("specifications")
    @l
    private final SerpAdvertSpecification specification;

    @c("status")
    @l
    private final String status;

    @c(CrashHianalyticsData.TIME)
    @l
    private final Long time;

    @c("title")
    @k
    private final String title;

    @c("trackVacanciesSurvey")
    @l
    private final Boolean trackVacanciesSurvey;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_CREDIT_CALCULATOR)
    @l
    private final TravelInstallments travelInstallments;

    @c("travelPriceVersion")
    @l
    private final AdvertTravelPriceVersion travelPriceVersion;

    @c("marketplaceSnippetTrustFactor")
    @l
    private final String trustFactor;
    private transient long uniqueId;

    @c("userType")
    @l
    private final String userType;

    @c("verification")
    @l
    private final SerpSellerVerification verification;

    @c("video")
    @l
    private final Video video;

    @c("xHash")
    @l
    private final String xHash;

    static {
        SerpAdvert$Companion$CREATOR$1 serpAdvert$Companion$CREATOR$1 = SerpAdvert$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(serpAdvert$Companion$CREATOR$1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SerpAdvert(@k String str, @l String str2, @l String str3, @l String str4, @l i iVar, @l DeliveryTerms deliveryTerms, @l String str5, @l Coordinates coordinates, @l Long l12, @l String str6, @k String str7, @l String str8, @l String str9, @l AdvertImage advertImage, @l NameIdEntity nameIdEntity, @l NameIdEntity nameIdEntity2, @l SerpSellerVerification serpSellerVerification, @l List<String> list, @l UniversalColor universalColor, @l String str10, @l String str11, @l String str12, @l String str13, @l String str14, @l String str15, @l DiscountIcon discountIcon, @l PriceList priceList, @l String str16, @l Video video, @l String str17, boolean z12, @l Boolean bool, @l Boolean bool2, @l DeepLink deepLink, @l Map<String, String> map, @l SerpAdvertStr serpAdvertStr, @l List<DimmedImage> list2, @l List<? extends ConstructorAdvertGalleryItemModel> list3, @l Action action, @l String str18, @l LegacySerpAdvertBadge legacySerpAdvertBadge, @l SerpBadgeBar serpBadgeBar, @l AdvertItemActions advertItemActions, @l AdvertActions advertActions, @l List<GeoReference> list4, @l QuorumFilterInfo quorumFilterInfo, @l RadiusInfo radiusInfo, @l AdvertSellerInfo advertSellerInfo, @l GigShiftInfo gigShiftInfo, @l Boolean bool3, @l Boolean bool4, @l String str19, @l List<String> list5, @l String str20, @l String str21, @l Integer num, boolean z13, @l String str22, @l SerpAdvertSpecification serpAdvertSpecification, @l Boolean bool5, @l AttributedText attributedText, @l Boolean bool6, @l Boolean bool7, @l RealtorBonus realtorBonus, @l BadgeSticker badgeSticker, @l SnippetType snippetType, @l BuyWithDeliveryButton buyWithDeliveryButton, @l KeyAttributes keyAttributes, @l BuyerBonuses buyerBonuses, @l String str23, @l HotelRating hotelRating, @l GeoDistance geoDistance, @l StrRatingAndReviews strRatingAndReviews, @l Boolean bool8, @l Boolean bool9, @l Boolean bool10, @l TravelInstallments travelInstallments, @l AdvertTravelPriceVersion advertTravelPriceVersion) {
        this.id = str;
        this.address = str2;
        this.addressesAdditionalInfo = str3;
        this.location = str4;
        this.delivery = iVar;
        this.deliveryTerms = deliveryTerms;
        this.distance = str5;
        this.coordinates = coordinates;
        this.time = l12;
        this.formattedTime = str6;
        this.title = str7;
        this.description = str8;
        this.userType = str9;
        this.image = advertImage;
        this.category = nameIdEntity;
        this.shop = nameIdEntity2;
        this.verification = serpSellerVerification;
        this.services = list;
        this.highlightColor = universalColor;
        this.schedule = str10;
        this.price = str11;
        this.normalizedPrice = str12;
        this.priceWithoutDiscount = str13;
        this.previousPrice = str14;
        this.previousPriceHint = str15;
        this.discountIcon = discountIcon;
        this.priceList = priceList;
        this.priceSubtitle = str16;
        this.video = video;
        this.status = str17;
        this.isFavorite = z12;
        this.isFavoriteVisible = bool;
        this.isVerifiedSeller = bool2;
        this.deepLink = deepLink;
        this.analyticParams = map;
        this.shortTermRent = serpAdvertStr;
        this.imageList = list2;
        this.galleryItems = list3;
        this.additionalAction = action;
        this.additionalName = str18;
        this.badge = legacySerpAdvertBadge;
        this.badgeBar = serpBadgeBar;
        this.moreActions = advertItemActions;
        this.contacts = advertActions;
        this.geoReferences = list4;
        this.quorumFilterInfo = quorumFilterInfo;
        this.radiusInfo = radiusInfo;
        this.sellerInfo = advertSellerInfo;
        this.gigShiftInfo = gigShiftInfo;
        this.hasRealtyLayout = bool3;
        this.hasVideo = bool4;
        this.nativeVideoABCategory = str19;
        this.exposureParams = list5;
        this.inStock = str20;
        this.trustFactor = str21;
        this.locationId = num;
        this.hidesViewedBadge = z13;
        this.xHash = str22;
        this.specification = serpAdvertSpecification;
        this.reserved = bool5;
        this.cvDescription = attributedText;
        this.hasDiscount = bool6;
        this.trackVacanciesSurvey = bool7;
        this.realtorBonus = realtorBonus;
        this.badgeSticker = badgeSticker;
        this.snippetType = snippetType;
        this.buyWithDeliveryButton = buyWithDeliveryButton;
        this.keyAttributes = keyAttributes;
        this.buyerBonuses = buyerBonuses;
        this.dateRange = str23;
        this.hotelRating = hotelRating;
        this.geoDistance = geoDistance;
        this.ratingAndReviews = strRatingAndReviews;
        this.isStrRedesign = bool8;
        this.isRedesign = bool9;
        this.isExtendedGallery = bool10;
        this.travelInstallments = travelInstallments;
        this.travelPriceVersion = advertTravelPriceVersion;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Action getAdditionalAction() {
        return this.additionalAction;
    }

    @l
    public final String getAdditionalName() {
        return this.additionalName;
    }

    @l
    public final String getAddress() {
        return this.address;
    }

    @l
    public final String getAddressesAdditionalInfo() {
        return this.addressesAdditionalInfo;
    }

    @l
    public final Map<String, String> getAnalyticParams() {
        return this.analyticParams;
    }

    @l
    public final LegacySerpAdvertBadge getBadge() {
        return this.badge;
    }

    @l
    public final SerpBadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @l
    public final BadgeSticker getBadgeSticker() {
        return this.badgeSticker;
    }

    @l
    public final BuyWithDeliveryButton getBuyWithDeliveryButton() {
        return this.buyWithDeliveryButton;
    }

    @l
    public final BuyerBonuses getBuyerBonuses() {
        return this.buyerBonuses;
    }

    @l
    public final NameIdEntity getCategory() {
        return this.category;
    }

    @l
    public final AdvertActions getContacts() {
        return this.contacts;
    }

    @l
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @l
    public final AttributedText getCvDescription() {
        return this.cvDescription;
    }

    @l
    public final String getDateRange() {
        return this.dateRange;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final i getDelivery() {
        return this.delivery;
    }

    @l
    public final DeliveryTerms getDeliveryTerms() {
        return this.deliveryTerms;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final DiscountIcon getDiscountIcon() {
        return this.discountIcon;
    }

    @l
    public final String getDistance() {
        return this.distance;
    }

    @l
    public final List<String> getExposureParams() {
        return this.exposureParams;
    }

    @l
    public final String getFormattedTime() {
        return this.formattedTime;
    }

    @l
    public final List<ConstructorAdvertGalleryItemModel> getGalleryItems() {
        return this.galleryItems;
    }

    @l
    public final GeoDistance getGeoDistance() {
        return this.geoDistance;
    }

    @l
    public final List<GeoReference> getGeoReferences() {
        return this.geoReferences;
    }

    @l
    public final GigShiftInfo getGigShiftInfo() {
        return this.gigShiftInfo;
    }

    @l
    public final Boolean getHasDiscount() {
        return this.hasDiscount;
    }

    @l
    public final Boolean getHasRealtyLayout() {
        return this.hasRealtyLayout;
    }

    @l
    public final Boolean getHasVideo() {
        return this.hasVideo;
    }

    public final boolean getHidesViewedBadge() {
        return this.hidesViewedBadge;
    }

    @l
    public final UniversalColor getHighlightColor() {
        return this.highlightColor;
    }

    @l
    public final HotelRating getHotelRating() {
        return this.hotelRating;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final AdvertImage getImage() {
        return this.image;
    }

    @l
    public final List<DimmedImage> getImageList() {
        return this.imageList;
    }

    @l
    public final String getInStock() {
        return this.inStock;
    }

    @l
    public final KeyAttributes getKeyAttributes() {
        return this.keyAttributes;
    }

    @l
    public final String getLocation() {
        return this.location;
    }

    @l
    public final Integer getLocationId() {
        return this.locationId;
    }

    @l
    public final AdvertItemActions getMoreActions() {
        return this.moreActions;
    }

    @l
    public final String getNativeVideoABCategory() {
        return this.nativeVideoABCategory;
    }

    @l
    public final String getNormalizedPrice() {
        return this.normalizedPrice;
    }

    @l
    public final String getPreviousPrice() {
        return this.previousPrice;
    }

    @l
    public final String getPreviousPriceHint() {
        return this.previousPriceHint;
    }

    @l
    public final String getPrice() {
        return this.price;
    }

    @l
    public final PriceList getPriceList() {
        return this.priceList;
    }

    @l
    public final String getPriceSubtitle() {
        return this.priceSubtitle;
    }

    @l
    public final String getPriceWithoutDiscount() {
        return this.priceWithoutDiscount;
    }

    @l
    public final QuorumFilterInfo getQuorumFilterInfo() {
        return this.quorumFilterInfo;
    }

    @l
    public final RadiusInfo getRadiusInfo() {
        return this.radiusInfo;
    }

    @l
    public final StrRatingAndReviews getRatingAndReviews() {
        return this.ratingAndReviews;
    }

    @l
    public final RealtorBonus getRealtorBonus() {
        return this.realtorBonus;
    }

    @l
    public final Boolean getReserved() {
        return this.reserved;
    }

    @l
    public final String getSchedule() {
        return this.schedule;
    }

    @l
    public final AdvertSellerInfo getSellerInfo() {
        return this.sellerInfo;
    }

    @l
    public final List<String> getServices() {
        return this.services;
    }

    @l
    public final NameIdEntity getShop() {
        return this.shop;
    }

    @l
    public final SerpAdvertStr getShortTermRent() {
        return this.shortTermRent;
    }

    @l
    public final SnippetType getSnippetType() {
        return this.snippetType;
    }

    @l
    public final SerpAdvertSpecification getSpecification() {
        return this.specification;
    }

    @l
    public final String getStatus() {
        return this.status;
    }

    @l
    public final Long getTime() {
        return this.time;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final Boolean getTrackVacanciesSurvey() {
        return this.trackVacanciesSurvey;
    }

    @l
    public final TravelInstallments getTravelInstallments() {
        return this.travelInstallments;
    }

    @l
    public final AdvertTravelPriceVersion getTravelPriceVersion() {
        return this.travelPriceVersion;
    }

    @l
    public final String getTrustFactor() {
        return this.trustFactor;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    @l
    public final String getUserType() {
        return this.userType;
    }

    @l
    public final SerpSellerVerification getVerification() {
        return this.verification;
    }

    @l
    public final Video getVideo() {
        return this.video;
    }

    @l
    public final String getXHash() {
        return this.xHash;
    }

    @l
    /* renamed from: isExtendedGallery, reason: from getter */
    public final Boolean getIsExtendedGallery() {
        return this.isExtendedGallery;
    }

    /* renamed from: isFavorite, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @l
    /* renamed from: isFavoriteVisible, reason: from getter */
    public final Boolean getIsFavoriteVisible() {
        return this.isFavoriteVisible;
    }

    @l
    /* renamed from: isRedesign, reason: from getter */
    public final Boolean getIsRedesign() {
        return this.isRedesign;
    }

    @l
    /* renamed from: isStrRedesign, reason: from getter */
    public final Boolean getIsStrRedesign() {
        return this.isStrRedesign;
    }

    @l
    /* renamed from: isVerifiedSeller, reason: from getter */
    public final Boolean getIsVerifiedSeller() {
        return this.isVerifiedSeller;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.address);
        dest.writeString(this.addressesAdditionalInfo);
        dest.writeString(this.location);
        dest.writeString(this.distance);
        i iVar = this.delivery;
        String strE = iVar != null ? C34328m0.e(iVar) : null;
        o1<ClassLoader, o1<String, Parcelable.Creator<?>>> o1Var = J3.f318636a;
        dest.writeValue(strE);
        dest.writeParcelable(this.deliveryTerms, flags);
        dest.writeParcelable(this.coordinates, flags);
        dest.writeValue(this.time);
        dest.writeString(this.formattedTime);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.userType);
        dest.writeParcelable(this.image, flags);
        dest.writeParcelable(this.category, flags);
        dest.writeParcelable(this.shop, flags);
        dest.writeParcelable(this.verification, flags);
        dest.writeStringList(this.services);
        dest.writeParcelable(this.highlightColor, flags);
        dest.writeString(this.schedule);
        dest.writeString(this.price);
        dest.writeString(this.normalizedPrice);
        dest.writeString(this.priceWithoutDiscount);
        dest.writeString(this.previousPrice);
        dest.writeString(this.previousPriceHint);
        dest.writeParcelable(this.discountIcon, flags);
        dest.writeParcelable(this.priceList, flags);
        dest.writeString(this.priceSubtitle);
        dest.writeParcelable(this.video, flags);
        dest.writeString(this.status);
        dest.writeInt(this.isFavorite ? 1 : 0);
        dest.writeValue(this.isFavoriteVisible);
        dest.writeValue(this.isVerifiedSeller);
        dest.writeParcelable(this.deepLink, flags);
        J3.f(dest, this.analyticParams);
        dest.writeParcelable(this.shortTermRent, flags);
        J3.e(this.imageList, dest, 0);
        J3.e(this.galleryItems, dest, 0);
        dest.writeParcelable(this.additionalAction, flags);
        dest.writeString(this.additionalName);
        dest.writeParcelable(this.badge, flags);
        dest.writeParcelable(this.badgeBar, flags);
        dest.writeParcelable(this.moreActions, flags);
        dest.writeParcelable(this.contacts, flags);
        J3.e(this.geoReferences, dest, flags);
        dest.writeParcelable(this.quorumFilterInfo, flags);
        dest.writeParcelable(this.radiusInfo, flags);
        dest.writeParcelable(this.sellerInfo, flags);
        dest.writeParcelable(this.gigShiftInfo, flags);
        dest.writeValue(this.hasRealtyLayout);
        dest.writeValue(this.hasVideo);
        dest.writeString(this.nativeVideoABCategory);
        dest.writeStringList(this.exposureParams);
        dest.writeString(this.inStock);
        dest.writeString(this.trustFactor);
        dest.writeValue(this.locationId);
        dest.writeInt(this.hidesViewedBadge ? 1 : 0);
        dest.writeString(this.xHash);
        dest.writeParcelable(this.specification, flags);
        dest.writeValue(this.trackVacanciesSurvey);
        dest.writeValue(this.hasDiscount);
        dest.writeParcelable(this.realtorBonus, flags);
        dest.writeParcelable(this.badgeSticker, flags);
        dest.writeParcelable(this.snippetType, flags);
        dest.writeParcelable(this.buyWithDeliveryButton, flags);
        dest.writeParcelable(this.keyAttributes, flags);
        dest.writeParcelable(this.buyerBonuses, flags);
        dest.writeParcelable(this.hotelRating, flags);
        dest.writeParcelable(this.geoDistance, flags);
        dest.writeParcelable(this.ratingAndReviews, flags);
        dest.writeValue(this.isStrRedesign);
        dest.writeValue(this.isRedesign);
        dest.writeParcelable(this.travelInstallments, flags);
        dest.writeParcelable(this.travelPriceVersion, flags);
        dest.writeLong(getUniqueId());
    }

    public /* synthetic */ SerpAdvert(String str, String str2, String str3, String str4, i iVar, DeliveryTerms deliveryTerms, String str5, Coordinates coordinates, Long l12, String str6, String str7, String str8, String str9, AdvertImage advertImage, NameIdEntity nameIdEntity, NameIdEntity nameIdEntity2, SerpSellerVerification serpSellerVerification, List list, UniversalColor universalColor, String str10, String str11, String str12, String str13, String str14, String str15, DiscountIcon discountIcon, PriceList priceList, String str16, Video video, String str17, boolean z12, Boolean bool, Boolean bool2, DeepLink deepLink, Map map, SerpAdvertStr serpAdvertStr, List list2, List list3, Action action, String str18, LegacySerpAdvertBadge legacySerpAdvertBadge, SerpBadgeBar serpBadgeBar, AdvertItemActions advertItemActions, AdvertActions advertActions, List list4, QuorumFilterInfo quorumFilterInfo, RadiusInfo radiusInfo, AdvertSellerInfo advertSellerInfo, GigShiftInfo gigShiftInfo, Boolean bool3, Boolean bool4, String str19, List list5, String str20, String str21, Integer num, boolean z13, String str22, SerpAdvertSpecification serpAdvertSpecification, Boolean bool5, AttributedText attributedText, Boolean bool6, Boolean bool7, RealtorBonus realtorBonus, BadgeSticker badgeSticker, SnippetType snippetType, BuyWithDeliveryButton buyWithDeliveryButton, KeyAttributes keyAttributes, BuyerBonuses buyerBonuses, String str23, HotelRating hotelRating, GeoDistance geoDistance, StrRatingAndReviews strRatingAndReviews, Boolean bool8, Boolean bool9, Boolean bool10, TravelInstallments travelInstallments, AdvertTravelPriceVersion advertTravelPriceVersion, int i12, int i13, int i14, C42822w c42822w) {
        this(str, str2, str3, str4, iVar, deliveryTerms, str5, coordinates, l12, str6, str7, str8, str9, advertImage, nameIdEntity, nameIdEntity2, serpSellerVerification, list, universalColor, str10, str11, str12, str13, str14, str15, discountIcon, priceList, str16, video, str17, z12, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? Boolean.TRUE : bool, bool2, deepLink, map, serpAdvertStr, list2, (i13 & 32) != 0 ? null : list3, action, str18, legacySerpAdvertBadge, serpBadgeBar, advertItemActions, advertActions, list4, quorumFilterInfo, radiusInfo, advertSellerInfo, (i13 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : gigShiftInfo, bool3, bool4, (i13 & 524288) != 0 ? null : str19, (i13 & 1048576) != 0 ? null : list5, str20, str21, num, z13, str22, serpAdvertSpecification, (i13 & 134217728) != 0 ? null : bool5, (i13 & 268435456) != 0 ? null : attributedText, (i13 & 536870912) != 0 ? Boolean.FALSE : bool6, (i13 & 1073741824) != 0 ? null : bool7, (i13 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : realtorBonus, (i14 & 1) != 0 ? null : badgeSticker, (i14 & 2) != 0 ? null : snippetType, (i14 & 4) != 0 ? null : buyWithDeliveryButton, (i14 & 8) != 0 ? null : keyAttributes, (i14 & 16) != 0 ? null : buyerBonuses, (i14 & 32) != 0 ? null : str23, (i14 & 64) != 0 ? null : hotelRating, (i14 & 128) != 0 ? null : geoDistance, (i14 & 256) != 0 ? null : strRatingAndReviews, (i14 & 512) != 0 ? null : bool8, (i14 & 1024) != 0 ? null : bool9, (i14 & 2048) != 0 ? null : bool10, (i14 & 4096) != 0 ? null : travelInstallments, (i14 & 8192) != 0 ? null : advertTravelPriceVersion);
    }
}
