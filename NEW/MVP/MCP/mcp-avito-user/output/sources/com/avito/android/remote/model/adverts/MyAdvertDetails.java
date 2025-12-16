package com.avito.android.remote.model.adverts;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.BodyCondition;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AddedByAvitoParams;
import com.avito.android.remote.model.AdditionalSeller;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.AdvertSellerShortTermRent;
import com.avito.android.remote.model.AdvertSharing;
import com.avito.android.remote.model.AnonymousNumber;
import com.avito.android.remote.model.BeduinV2;
import com.avito.android.remote.model.CarMarketPrice;
import com.avito.android.remote.model.CheckInRules;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ItemPromotion;
import com.avito.android.remote.model.MyAdvertAutoSelect;
import com.avito.android.remote.model.MyAdvertSafeDeal;
import com.avito.android.remote.model.MyAdvertVas;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.RejectReason;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.ServicesSellerSubscriptionBanner;
import com.avito.android.remote.model.SimpleAction;
import com.avito.android.remote.model.SimpleAdvertAction;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.Verification;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadgeBar;
import com.avito.android.remote.model.adverts.multi_item.MultiItemParam;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.domoteka_report_teaser.DomotekaReportTeaser;
import com.avito.android.remote.model.evidence.EvidenceData;
import com.avito.android.remote.model.feature_teaser.AdvertDetailsFeaturesTeasers;
import com.avito.android.remote.model.feature_teaser.ApartmentFeature;
import com.avito.android.remote.model.installments.InstallmentsPromoBlockData;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.my_advert.AppliedServicesInfo;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.model.urgency.MultiUrgencyBlockResponse;
import com.avito.android.remote.model.user_adverts.auction.AuctionBanner;
import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import com.google.gson.annotations.c;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: MyAdvertDetails.kt */
@InterfaceC19823a
@Metadata(d1 = {"\u0000í\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\bÓ\u0001\b\u0007\u0018\u00002\u00020\u0001:RÜ\u0002Ý\u0002Þ\u0002ß\u0002à\u0002á\u0002â\u0002ã\u0002ä\u0002å\u0002æ\u0002ç\u0002è\u0002é\u0002ê\u0002ë\u0002ì\u0002í\u0002î\u0002ï\u0002ð\u0002ñ\u0002ò\u0002ó\u0002ô\u0002õ\u0002ö\u0002÷\u0002ø\u0002ù\u0002ú\u0002û\u0002ü\u0002ý\u0002þ\u0002ÿ\u0002\u0080\u0003\u0081\u0003\u0082\u0003\u0083\u0003\u0084\u0003B»\t\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010$\u0012\b\u0010*\u001a\u0004\u0018\u00010+\u0012\b\u0010,\u001a\u0004\u0018\u00010-\u0012\b\u0010.\u001a\u0004\u0018\u00010/\u0012\b\u00100\u001a\u0004\u0018\u000101\u0012\b\u00102\u001a\u0004\u0018\u000103\u0012\b\u00104\u001a\u0004\u0018\u000105\u0012\u000e\u00106\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\r\u0012\b\u00108\u001a\u0004\u0018\u000109\u0012\b\u0010:\u001a\u0004\u0018\u00010;\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\b\u0010=\u001a\u0004\u0018\u00010>\u0012\b\u0010?\u001a\u0004\u0018\u00010@\u0012\b\u0010A\u001a\u0004\u0018\u00010B\u0012\b\u0010C\u001a\u0004\u0018\u00010D\u0012\b\u0010E\u001a\u0004\u0018\u00010F\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010\r\u0012\b\u0010J\u001a\u0004\u0018\u00010I\u0012\b\u0010K\u001a\u0004\u0018\u00010L\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O\u0012\b\u0010P\u001a\u0004\u0018\u00010Q\u0012\b\u0010R\u001a\u0004\u0018\u00010S\u0012\b\u0010T\u001a\u0004\u0018\u00010U\u0012\b\u0010V\u001a\u0004\u0018\u00010W\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010Y\u0012\b\u0010Z\u001a\u0004\u0018\u00010[\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010]\u0012\u0010\b\u0002\u0010^\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010\r\u0012\b\b\u0002\u0010`\u001a\u00020a\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010c\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010e\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010g\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010i\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010k\u001a\u0004\u0018\u00010l\u0012\n\b\u0002\u0010m\u001a\u0004\u0018\u00010n\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u00010p\u0012\u0010\b\u0002\u0010q\u001a\n\u0012\u0004\u0012\u00020r\u0018\u00010\r\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010t\u0012\n\b\u0002\u0010u\u001a\u0004\u0018\u00010v\u0012\n\b\u0002\u0010w\u001a\u0004\u0018\u00010x\u0012\n\b\u0002\u0010y\u001a\u0004\u0018\u00010z\u0012\n\b\u0002\u0010{\u001a\u0004\u0018\u00010|\u0012\n\b\u0002\u0010}\u001a\u0004\u0018\u00010~\u0012\u000b\b\u0002\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001\u0012\u0012\b\u0002\u0010\u0081\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010\r\u0012\f\b\u0002\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001\u0012\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u0001\u0012\f\b\u0002\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001\u0012\f\b\u0002\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001\u0012\u0012\b\u0002\u0010\u008b\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008c\u0001\u0018\u00010\r\u0012\u0012\b\u0002\u0010\u008d\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008e\u0001\u0018\u00010\r\u0012\f\b\u0002\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u0001\u0012\f\b\u0002\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u0001\u0012\f\b\u0002\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0094\u0001\u0012\f\b\u0002\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u008e\u0001\u0012\f\b\u0002\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u0001\u0012\u0012\b\u0002\u0010\u0098\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0099\u0001\u0018\u00010\r\u0012\f\b\u0002\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001\u0012\f\b\u0002\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u0001\u0012\f\b\u0002\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u0001\u0012\f\b\u0002\u0010 \u0001\u001a\u0005\u0018\u00010¡\u0001\u0012\f\b\u0002\u0010¢\u0001\u001a\u0005\u0018\u00010£\u0001\u0012\f\b\u0002\u0010¤\u0001\u001a\u0005\u0018\u00010\u008e\u0001\u0012\f\b\u0002\u0010¥\u0001\u001a\u0005\u0018\u00010¦\u0001\u0012\f\b\u0002\u0010§\u0001\u001a\u0005\u0018\u00010¨\u0001\u0012\f\b\u0002\u0010©\u0001\u001a\u0005\u0018\u00010ª\u0001\u0012\u0012\b\u0002\u0010«\u0001\u001a\u000b\u0012\u0005\u0012\u00030¬\u0001\u0018\u00010\r\u0012\f\b\u0002\u0010\u00ad\u0001\u001a\u0005\u0018\u00010®\u0001\u0012\f\b\u0002\u0010¯\u0001\u001a\u0005\u0018\u00010°\u0001\u0012\f\b\u0002\u0010±\u0001\u001a\u0005\u0018\u00010²\u0001¢\u0006\u0003\u0010³\u0001R\u001b\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\r¢\u0006\n\n\u0000\u001a\u0006\b´\u0001\u0010µ\u0001R\u0015\u0010P\u001a\u0004\u0018\u00010Q¢\u0006\n\n\u0000\u001a\u0006\b¶\u0001\u0010·\u0001R\u0017\u0010¢\u0001\u001a\u0005\u0018\u00010£\u0001¢\u0006\n\n\u0000\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0015\u0010w\u001a\u0004\u0018\u00010x¢\u0006\n\n\u0000\u001a\u0006\bº\u0001\u0010»\u0001R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b¼\u0001\u0010½\u0001R\u0015\u00100\u001a\u0004\u0018\u000101¢\u0006\n\n\u0000\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0015\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\n\n\u0000\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u001e\u0010^\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010\rX\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\bÂ\u0001\u0010µ\u0001R\u0015\u0010V\u001a\u0004\u0018\u00010W¢\u0006\n\n\u0000\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0015\u00102\u001a\u0004\u0018\u000103¢\u0006\n\n\u0000\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0017\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u008e\u0001¢\u0006\n\n\u0000\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0013\u0010`\u001a\u00020a¢\u0006\n\n\u0000\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0017\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u0001¢\u0006\n\n\u0000\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0015\u0010{\u001a\u0004\u0018\u00010|¢\u0006\n\n\u0000\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0017\u0010±\u0001\u001a\u0005\u0018\u00010²\u0001¢\u0006\n\n\u0000\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0015\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\n\n\u0000\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u0016\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001¢\u0006\n\n\u0000\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0015\u0010h\u001a\u0004\u0018\u00010i¢\u0006\n\n\u0000\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0013\u0010\b\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\b×\u0001\u0010½\u0001R\u0015\u0010u\u001a\u0004\u0018\u00010v¢\u0006\n\n\u0000\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0015\u0010R\u001a\u0004\u0018\u00010S¢\u0006\n\n\u0000\u001a\u0006\bÚ\u0001\u0010Û\u0001R\u0017\u0010©\u0001\u001a\u0005\u0018\u00010ª\u0001¢\u0006\n\n\u0000\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0000\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0017\u0010¯\u0001\u001a\u0005\u0018\u00010°\u0001¢\u0006\n\n\u0000\u001a\u0006\bà\u0001\u0010á\u0001R\u0015\u0010b\u001a\u0004\u0018\u00010c¢\u0006\n\n\u0000\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0015\u0010J\u001a\u0004\u0018\u00010I¢\u0006\n\n\u0000\u001a\u0006\bä\u0001\u0010å\u0001R\u0017\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bæ\u0001\u0010ç\u0001R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bè\u0001\u0010½\u0001R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bé\u0001\u0010½\u0001R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bê\u0001\u0010½\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bë\u0001\u0010½\u0001R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bì\u0001\u0010½\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bí\u0001\u0010½\u0001R\u0017\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u0001¢\u0006\n\n\u0000\u001a\u0006\bî\u0001\u0010ï\u0001R\u0017\u0010 \u0001\u001a\u0005\u0018\u00010¡\u0001¢\u0006\n\n\u0000\u001a\u0006\bð\u0001\u0010ñ\u0001R\u0015\u0010K\u001a\u0004\u0018\u00010L¢\u0006\n\n\u0000\u001a\u0006\bò\u0001\u0010ó\u0001R\u0015\u0010y\u001a\u0004\u0018\u00010z¢\u0006\n\n\u0000\u001a\u0006\bô\u0001\u0010õ\u0001R\u0017\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u0001¢\u0006\n\n\u0000\u001a\u0006\bö\u0001\u0010÷\u0001R\u001b\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\n\n\u0000\u001a\u0006\bø\u0001\u0010µ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bù\u0001\u0010½\u0001R\u001b\u00106\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\r¢\u0006\n\n\u0000\u001a\u0006\bú\u0001\u0010µ\u0001R\u0015\u0010s\u001a\u0004\u0018\u00010t¢\u0006\n\n\u0000\u001a\u0006\bû\u0001\u0010ü\u0001R\u0012\u0010#\u001a\u00020$¢\u0006\t\n\u0000\u001a\u0005\b#\u0010ý\u0001R\u0017\u0010j\u001a\u0004\u0018\u00010$¢\u0006\f\n\u0003\u0010ÿ\u0001\u001a\u0005\bj\u0010þ\u0001R\u0015\u0010}\u001a\u0004\u0018\u00010~¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002R\u0017\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R\u001d\u0010«\u0001\u001a\u000b\u0012\u0005\u0012\u00030¬\u0001\u0018\u00010\r¢\u0006\n\n\u0000\u001a\u0006\b\u0084\u0002\u0010µ\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0002\u0010½\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0086\u0002\u0010½\u0001R\u0017\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0089\u0002\u0010½\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u008a\u0002\u0010½\u0001R\u0015\u0010M\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u008b\u0002\u0010½\u0001R\u0017\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R\u001d\u0010\u0098\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0099\u0001\u0018\u00010\r¢\u0006\n\n\u0000\u001a\u0006\b\u008e\u0002\u0010µ\u0001R\u0017\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0094\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002R\u0015\u0010:\u001a\u0004\u0018\u00010;¢\u0006\n\n\u0000\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0017\u0010¤\u0001\u001a\u0005\u0018\u00010\u008e\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0093\u0002\u0010È\u0001R\u0015\u00104\u001a\u0004\u0018\u000105¢\u0006\n\n\u0000\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002R\u0015\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b\u0096\u0002\u0010½\u0001R\u0017\u0010¥\u0001\u001a\u0005\u0018\u00010¦\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0017\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0015\u0010=\u001a\u0004\u0018\u00010>¢\u0006\n\n\u0000\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R\u0017\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002R\u001b\u0010q\u001a\n\u0012\u0004\u0012\u00020r\u0018\u00010\r¢\u0006\n\n\u0000\u001a\u0006\b\u009f\u0002\u0010µ\u0001R\u0018\u0010)\u001a\u0004\u0018\u00010$¢\u0006\r\n\u0003\u0010ÿ\u0001\u001a\u0006\b \u0002\u0010þ\u0001R\u0017\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001¢\u0006\n\n\u0000\u001a\u0006\b¡\u0002\u0010¢\u0002R\u0015\u0010m\u001a\u0004\u0018\u00010n¢\u0006\n\n\u0000\u001a\u0006\b£\u0002\u0010¤\u0002R\u001b\u0010H\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010\r¢\u0006\n\n\u0000\u001a\u0006\b¥\u0002\u0010µ\u0001R\u0015\u0010G\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\b¦\u0002\u0010½\u0001R\u0015\u0010o\u001a\u0004\u0018\u00010p¢\u0006\n\n\u0000\u001a\u0006\b§\u0002\u0010¨\u0002R\u0015\u0010N\u001a\u0004\u0018\u00010O¢\u0006\n\n\u0000\u001a\u0006\b©\u0002\u0010ª\u0002R\u0015\u0010Z\u001a\u0004\u0018\u00010[¢\u0006\n\n\u0000\u001a\u0006\b«\u0002\u0010¬\u0002R\u0015\u0010?\u001a\u0004\u0018\u00010@¢\u0006\n\n\u0000\u001a\u0006\b\u00ad\u0002\u0010®\u0002R\u0015\u0010k\u001a\u0004\u0018\u00010l¢\u0006\n\n\u0000\u001a\u0006\b¯\u0002\u0010°\u0002R\u0015\u0010d\u001a\u0004\u0018\u00010e¢\u0006\n\n\u0000\u001a\u0006\b±\u0002\u0010²\u0002R\u0015\u0010&\u001a\u0004\u0018\u00010'¢\u0006\n\n\u0000\u001a\u0006\b³\u0002\u0010´\u0002R\u0015\u0010f\u001a\u0004\u0018\u00010g¢\u0006\n\n\u0000\u001a\u0006\bµ\u0002\u0010¶\u0002R\u0017\u0010§\u0001\u001a\u0005\u0018\u00010¨\u0001¢\u0006\n\n\u0000\u001a\u0006\b·\u0002\u0010¸\u0002R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\n\n\u0000\u001a\u0006\b¹\u0002\u0010º\u0002R\u0015\u0010,\u001a\u0004\u0018\u00010-¢\u0006\n\n\u0000\u001a\u0006\b»\u0002\u0010¼\u0002R\u0015\u0010T\u001a\u0004\u0018\u00010U¢\u0006\n\n\u0000\u001a\u0006\b½\u0002\u0010¾\u0002R\u0015\u0010C\u001a\u0004\u0018\u00010D¢\u0006\n\n\u0000\u001a\u0006\b¿\u0002\u0010À\u0002R\u0015\u0010E\u001a\u0004\u0018\u00010F¢\u0006\n\n\u0000\u001a\u0006\bÁ\u0002\u0010Â\u0002R\u0013\u0010<\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bÃ\u0002\u0010½\u0001R\u0015\u0010A\u001a\u0004\u0018\u00010B¢\u0006\n\n\u0000\u001a\u0006\bÄ\u0002\u0010Å\u0002R\u0017\u0010\u00ad\u0001\u001a\u0005\u0018\u00010®\u0001¢\u0006\n\n\u0000\u001a\u0006\bÆ\u0002\u0010Ç\u0002R\u0018\u0010\\\u001a\u0004\u0018\u00010]X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\bÈ\u0002\u0010É\u0002R\u0013\u0010\u0013\u001a\u00020\u0014¢\u0006\n\n\u0000\u001a\u0006\bÊ\u0002\u0010Ë\u0002R\u0013\u0010\u000f\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bÌ\u0002\u0010½\u0001R\u0013\u0010\u0010\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bÍ\u0002\u0010½\u0001R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bÎ\u0002\u0010½\u0001R\u0013\u0010%\u001a\u00020\u0003¢\u0006\n\n\u0000\u001a\u0006\bÏ\u0002\u0010½\u0001R\u001d\u0010\u008b\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008c\u0001\u0018\u00010\r¢\u0006\n\n\u0000\u001a\u0006\bÐ\u0002\u0010µ\u0001R\u001d\u0010\u008d\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008e\u0001\u0018\u00010\r¢\u0006\n\n\u0000\u001a\u0006\bÑ\u0002\u0010µ\u0001R\u0015\u0010*\u001a\u0004\u0018\u00010+¢\u0006\n\n\u0000\u001a\u0006\bÒ\u0002\u0010Ó\u0002R\u0015\u0010.\u001a\u0004\u0018\u00010/¢\u0006\n\n\u0000\u001a\u0006\bÔ\u0002\u0010Õ\u0002R\u0015\u0010X\u001a\u0004\u0018\u00010Y¢\u0006\n\n\u0000\u001a\u0006\bÖ\u0002\u0010×\u0002R\u001d\u0010\u0081\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010\r¢\u0006\n\n\u0000\u001a\u0006\bØ\u0002\u0010µ\u0001R\u0015\u00108\u001a\u0004\u0018\u000109¢\u0006\n\n\u0000\u001a\u0006\bÙ\u0002\u0010Ú\u0002R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0000\u001a\u0006\bÛ\u0002\u0010½\u0001¨\u0006\u0085\u0003"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails;", "", "id", "", "locationName", "metroName", "districtName", "directionName", "categoryId", SearchParamsConverterKt.LOCATION_ID, SearchParamsConverterKt.METRO_ID, AddressParameter.TYPE, "geoReferences", "", "Lcom/avito/android/remote/model/GeoReference;", "title", "toolbarTitle", SearchParamsConverterKt.DIRECTION_ID, SearchParamsConverterKt.DISTRICT_ID, CrashHianalyticsData.TIME, "", "ttlHumanized", "wizardId", ServiceTransportationWidget.LocationField.COORDINATES, "Lcom/avito/android/remote/model/Coordinates;", "sharing", "Lcom/avito/android/remote/model/AdvertSharing;", "actions", "Lcom/avito/android/remote/model/Action;", "description", "descriptionHtml", "bodyCondition", "Lcom/avito/android/deep_linking/links/BodyCondition;", "anonymousNumber", "Lcom/avito/android/remote/model/AnonymousNumber;", "isDeliveryEnabled", "", "userType", "seller", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Seller;", "phone", "protection", "vas", "Lcom/avito/android/remote/model/MyAdvertVas;", "shop", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Shop;", "vasBundlesBanner", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$VasBundlesBanner;", "alertBanner", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$AlertBanner;", "auctionBanner", "Lcom/avito/android/remote/model/user_adverts/auction/AuctionBanner;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/remote/model/AdvertParameters;", "images", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ExtendedImage;", "video", "Lcom/avito/android/remote/model/Video;", "nativeVideo", "Lcom/avito/android/remote/model/NativeVideo;", "status", "price", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Price;", "sales", "Lcom/avito/android/remote/model/adverts/Sales;", "stockManagement", "Lcom/avito/android/remote/model/adverts/StockManagement;", "stats", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats;", "statsBeduin", "Lcom/avito/android/remote/model/BeduinV2;", "reasonsTitle", "reasons", "Lcom/avito/android/remote/model/RejectReason;", "customReason", "evidenceData", "Lcom/avito/android/remote/model/evidence/EvidenceData;", "moderationInfo", "reservationInfo", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReservationInfo;", "activationInfo", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ActivationInfo;", "competitorAnalyticsInfo", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CompetitorAnalyticsInfo;", "shortTermRent", "Lcom/avito/android/remote/model/AdvertSellerShortTermRent;", "appliedServices", "Lcom/avito/android/remote/model/my_advert/AppliedServicesInfo;", "verification", "Lcom/avito/android/remote/model/Verification;", "safeDealServices", "Lcom/avito/android/remote/model/MyAdvertSafeDeal;", "teasers", "Lcom/avito/android/remote/model/feature_teaser/AdvertDetailsFeaturesTeasers;", "apartmentFeatures", "Lcom/avito/android/remote/model/feature_teaser/ApartmentFeature;", "autoPublish", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$AutoPublish;", "creditInfoItem", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CreditInfoItem;", "sbStatusBlock", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock;", "serviceBookingReminderBlock", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock;", "carMarketPrice", "Lcom/avito/android/remote/model/CarMarketPrice;", "isIacChosen", "salesContract", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SalesContract;", "realtyOwnerVerification", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$RealtyOwnerVerification;", "reliableOwner", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner;", "promoBlockFeed", "Lcom/avito/android/remote/model/adverts/PromoBlockData;", "installmentsPromoBlock", "Lcom/avito/android/remote/model/installments/InstallmentsPromoBlockData;", "checkInRules", "Lcom/avito/android/remote/model/CheckInRules;", "additionalSeller", "Lcom/avito/android/remote/model/AdditionalSeller;", "fashionAuthenticity", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$FashionAuthenticity;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeBar;", "itemPromotion", "Lcom/avito/android/remote/model/ItemPromotion;", "buyoutPhone", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BuyoutPhone;", "verificationRecommendationActions", "Lcom/avito/android/beduin_models/BeduinAction;", "itemReviews", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ItemReviews;", "autoSelect", "Lcom/avito/android/remote/model/MyAdvertAutoSelect;", "premierPartner", "Lcom/avito/android/remote/model/adverts/PremierPartner;", "publishWarningBanner", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$PublishWarningBanner;", "uxFeedbackConfigs", "Lcom/avito/android/remote/model/ux_feedback/UxFeedbackConfigOld;", "uxFeedbackDeepLinks", "Lcom/avito/android/deep_linking/links/DeepLink;", "fillParametersBanner", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$FillParametersBanner;", "domotekaReportTeaser", "Lcom/avito/android/remote/model/domoteka_report_teaser/DomotekaReportTeaser;", "multiUrgencyServicesBlock", "Lcom/avito/android/remote/model/urgency/MultiUrgencyBlockResponse;", "autoDescriptionFeedback", "multiAddresses", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MultiAddresses;", "multiItemParams", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemParam;", "machineryRentalBanner", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner;", "deliverySettings", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$DeliverySettings;", "promoActivities", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$PromoActivities;", "entryPointToAccountOwnerBanner", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$EntryPointToAccountOwnerBanner;", "addedByAvitoParams", "Lcom/avito/android/remote/model/AddedByAvitoParams;", "onAdvertLoadedDeepLink", "portfolio", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio;", "servicesSellerSubscriptionBanner", "Lcom/avito/android/remote/model/ServicesSellerSubscriptionBanner;", "contactsBbl", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl;", "jobListItems", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$JobListItem;", "supportAutomation", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SupportAutomation;", "copyAdvertTooltip", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CopyAdvertTooltip;", "bannerFromSxBanners", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BannerFromSxBanners;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Coordinates;Lcom/avito/android/remote/model/AdvertSharing;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/BodyCondition;Lcom/avito/android/remote/model/AnonymousNumber;ZLjava/lang/String;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Seller;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/MyAdvertVas;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Shop;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$VasBundlesBanner;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$AlertBanner;Lcom/avito/android/remote/model/user_adverts/auction/AuctionBanner;Lcom/avito/android/remote/model/AdvertParameters;Ljava/util/List;Lcom/avito/android/remote/model/Video;Lcom/avito/android/remote/model/NativeVideo;Ljava/lang/String;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Price;Lcom/avito/android/remote/model/adverts/Sales;Lcom/avito/android/remote/model/adverts/StockManagement;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats;Lcom/avito/android/remote/model/BeduinV2;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/RejectReason;Lcom/avito/android/remote/model/evidence/EvidenceData;Ljava/lang/String;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReservationInfo;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ActivationInfo;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CompetitorAnalyticsInfo;Lcom/avito/android/remote/model/AdvertSellerShortTermRent;Lcom/avito/android/remote/model/my_advert/AppliedServicesInfo;Lcom/avito/android/remote/model/Verification;Lcom/avito/android/remote/model/MyAdvertSafeDeal;Lcom/avito/android/remote/model/feature_teaser/AdvertDetailsFeaturesTeasers;Ljava/util/List;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$AutoPublish;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CreditInfoItem;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock;Lcom/avito/android/remote/model/CarMarketPrice;Ljava/lang/Boolean;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SalesContract;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$RealtyOwnerVerification;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner;Ljava/util/List;Lcom/avito/android/remote/model/installments/InstallmentsPromoBlockData;Lcom/avito/android/remote/model/CheckInRules;Lcom/avito/android/remote/model/AdditionalSeller;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$FashionAuthenticity;Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeBar;Lcom/avito/android/remote/model/ItemPromotion;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BuyoutPhone;Ljava/util/List;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ItemReviews;Lcom/avito/android/remote/model/MyAdvertAutoSelect;Lcom/avito/android/remote/model/adverts/PremierPartner;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$PublishWarningBanner;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$FillParametersBanner;Lcom/avito/android/remote/model/domoteka_report_teaser/DomotekaReportTeaser;Lcom/avito/android/remote/model/urgency/MultiUrgencyBlockResponse;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MultiAddresses;Ljava/util/List;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$DeliverySettings;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$PromoActivities;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$EntryPointToAccountOwnerBanner;Lcom/avito/android/remote/model/AddedByAvitoParams;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio;Lcom/avito/android/remote/model/ServicesSellerSubscriptionBanner;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl;Ljava/util/List;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SupportAutomation;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CopyAdvertTooltip;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BannerFromSxBanners;)V", "getActions", "()Ljava/util/List;", "getActivationInfo", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ActivationInfo;", "getAddedByAvitoParams", "()Lcom/avito/android/remote/model/AddedByAvitoParams;", "getAdditionalSeller", "()Lcom/avito/android/remote/model/AdditionalSeller;", "getAddress", "()Ljava/lang/String;", "getAlertBanner", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$AlertBanner;", "getAnonymousNumber", "()Lcom/avito/android/remote/model/AnonymousNumber;", "getApartmentFeatures$_avito_discouraged_avito_api_user_advert", "getAppliedServices", "()Lcom/avito/android/remote/model/my_advert/AppliedServicesInfo;", "getAuctionBanner", "()Lcom/avito/android/remote/model/user_adverts/auction/AuctionBanner;", "getAutoDescriptionFeedback", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getAutoPublish", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$AutoPublish;", "getAutoSelect", "()Lcom/avito/android/remote/model/MyAdvertAutoSelect;", "getBadgeBar", "()Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeBar;", "getBannerFromSxBanners", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BannerFromSxBanners;", "getBodyCondition", "()Lcom/avito/android/deep_linking/links/BodyCondition;", "getBuyoutPhone", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BuyoutPhone;", "getCarMarketPrice", "()Lcom/avito/android/remote/model/CarMarketPrice;", "getCategoryId", "getCheckInRules", "()Lcom/avito/android/remote/model/CheckInRules;", "getCompetitorAnalyticsInfo", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CompetitorAnalyticsInfo;", "getContactsBbl", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl;", "getCoordinates", "()Lcom/avito/android/remote/model/Coordinates;", "getCopyAdvertTooltip", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CopyAdvertTooltip;", "getCreditInfoItem", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CreditInfoItem;", "getCustomReason", "()Lcom/avito/android/remote/model/RejectReason;", "getDeliverySettings", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$DeliverySettings;", "getDescription", "getDescriptionHtml", "getDirectionId", "getDirectionName", "getDistrictId", "getDistrictName", "getDomotekaReportTeaser", "()Lcom/avito/android/remote/model/domoteka_report_teaser/DomotekaReportTeaser;", "getEntryPointToAccountOwnerBanner", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$EntryPointToAccountOwnerBanner;", "getEvidenceData", "()Lcom/avito/android/remote/model/evidence/EvidenceData;", "getFashionAuthenticity", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$FashionAuthenticity;", "getFillParametersBanner", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$FillParametersBanner;", "getGeoReferences", "getId", "getImages", "getInstallmentsPromoBlock", "()Lcom/avito/android/remote/model/installments/InstallmentsPromoBlockData;", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getItemPromotion", "()Lcom/avito/android/remote/model/ItemPromotion;", "getItemReviews", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ItemReviews;", "getJobListItems", "getLocationId", "getLocationName", "getMachineryRentalBanner", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner;", "getMetroId", "getMetroName", "getModerationInfo", "getMultiAddresses", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MultiAddresses;", "getMultiItemParams", "getMultiUrgencyServicesBlock", "()Lcom/avito/android/remote/model/urgency/MultiUrgencyBlockResponse;", "getNativeVideo", "()Lcom/avito/android/remote/model/NativeVideo;", "getOnAdvertLoadedDeepLink", "getParameters", "()Lcom/avito/android/remote/model/AdvertParameters;", "getPhone", "getPortfolio", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio;", "getPremierPartner", "()Lcom/avito/android/remote/model/adverts/PremierPartner;", "getPrice", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Price;", "getPromoActivities", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$PromoActivities;", "getPromoBlockFeed", "getProtection", "getPublishWarningBanner", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$PublishWarningBanner;", "getRealtyOwnerVerification", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$RealtyOwnerVerification;", "getReasons", "getReasonsTitle", "getReliableOwner", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner;", "getReservationInfo", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReservationInfo;", "getSafeDealServices", "()Lcom/avito/android/remote/model/MyAdvertSafeDeal;", "getSales", "()Lcom/avito/android/remote/model/adverts/Sales;", "getSalesContract", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SalesContract;", "getSbStatusBlock", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock;", "getSeller", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Seller;", "getServiceBookingReminderBlock", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock;", "getServicesSellerSubscriptionBanner", "()Lcom/avito/android/remote/model/ServicesSellerSubscriptionBanner;", "getSharing", "()Lcom/avito/android/remote/model/AdvertSharing;", "getShop", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Shop;", "getShortTermRent", "()Lcom/avito/android/remote/model/AdvertSellerShortTermRent;", "getStats", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats;", "getStatsBeduin", "()Lcom/avito/android/remote/model/BeduinV2;", "getStatus", "getStockManagement", "()Lcom/avito/android/remote/model/adverts/StockManagement;", "getSupportAutomation", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SupportAutomation;", "getTeasers$_avito_discouraged_avito_api_user_advert", "()Lcom/avito/android/remote/model/feature_teaser/AdvertDetailsFeaturesTeasers;", "getTime", "()J", "getTitle", "getToolbarTitle", "getTtlHumanized", "getUserType", "getUxFeedbackConfigs", "getUxFeedbackDeepLinks", "getVas", "()Lcom/avito/android/remote/model/MyAdvertVas;", "getVasBundlesBanner", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$VasBundlesBanner;", "getVerification", "()Lcom/avito/android/remote/model/Verification;", "getVerificationRecommendationActions", "getVideo", "()Lcom/avito/android/remote/model/Video;", "getWizardId", "ActivationInfo", "Advantage", "AlertBanner", "AutoPublish", "AutoPublishSwitcher", "BannerFromSxBanners", "BuyoutPhone", "CadastralField", "CompetitorAnalyticsInfo", "ContactsBbl", "CopyAdvertTooltip", "CreditInfoItem", "DeliverySettings", "EntryPointToAccountOwnerBanner", "ExtendedImage", "ExtraAction", "FashionAuthenticity", "FillParametersBanner", "ItemReviews", "JobListItem", "MachineryRentalBanner", "MainButtonAction", "MultiAddresses", "Portfolio", "Price", "PromoActivities", "PublishWarningBanner", "RealtyOwnerVerification", "ReliableOwner", "ReservationInfo", "SalesContract", "SbStatusBlock", "Seller", "ServiceBookingReminderBlock", "Shop", "Stats", "Style", "SupportAutomation", "Switcher", "VasBundlesBanner", "VerificationStatus", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MyAdvertDetails {

    @l
    private final List<Action> actions;

    @l
    private final ActivationInfo activationInfo;

    @l
    private final AddedByAvitoParams addedByAvitoParams;

    @l
    private final AdditionalSeller additionalSeller;

    @l
    private final String address;

    @l
    private final AlertBanner alertBanner;

    @l
    private final AnonymousNumber anonymousNumber;

    @l
    private final List<ApartmentFeature> apartmentFeatures;

    @l
    private final AppliedServicesInfo appliedServices;

    @l
    private final AuctionBanner auctionBanner;

    @l
    private final DeepLink autoDescriptionFeedback;

    @k
    private final AutoPublish autoPublish;

    @l
    private final MyAdvertAutoSelect autoSelect;

    @l
    private final AdvertBadgeBar badgeBar;

    @l
    private final BannerFromSxBanners bannerFromSxBanners;

    @l
    private final BodyCondition bodyCondition;

    @l
    private final BuyoutPhone buyoutPhone;

    @l
    private final CarMarketPrice carMarketPrice;

    @k
    private final String categoryId;

    @l
    private final CheckInRules checkInRules;

    @l
    private final CompetitorAnalyticsInfo competitorAnalyticsInfo;

    @l
    private final ContactsBbl contactsBbl;

    @l
    private final Coordinates coordinates;

    @l
    private final CopyAdvertTooltip copyAdvertTooltip;

    @l
    private final CreditInfoItem creditInfoItem;

    @l
    private final RejectReason customReason;

    @l
    private final DeliverySettings deliverySettings;

    @l
    private final String description;

    @l
    private final String descriptionHtml;

    @l
    private final String directionId;

    @l
    private final String directionName;

    @l
    private final String districtId;

    @l
    private final String districtName;

    @l
    private final DomotekaReportTeaser domotekaReportTeaser;

    @l
    private final EntryPointToAccountOwnerBanner entryPointToAccountOwnerBanner;

    @l
    private final EvidenceData evidenceData;

    @l
    private final FashionAuthenticity fashionAuthenticity;

    @l
    private final FillParametersBanner fillParametersBanner;

    @l
    private final List<GeoReference> geoReferences;

    @k
    private final String id;

    @l
    private final List<ExtendedImage> images;

    @l
    private final InstallmentsPromoBlockData installmentsPromoBlock;
    private final boolean isDeliveryEnabled;

    @l
    private final Boolean isIacChosen;

    @l
    private final ItemPromotion itemPromotion;

    @l
    private final ItemReviews itemReviews;

    @l
    private final List<JobListItem> jobListItems;

    @l
    private final String locationId;

    @l
    private final String locationName;

    @l
    private final MachineryRentalBanner machineryRentalBanner;

    @l
    private final String metroId;

    @l
    private final String metroName;

    @l
    private final String moderationInfo;

    @l
    private final MultiAddresses multiAddresses;

    @l
    private final List<MultiItemParam> multiItemParams;

    @l
    private final MultiUrgencyBlockResponse multiUrgencyServicesBlock;

    @l
    private final NativeVideo nativeVideo;

    @l
    private final DeepLink onAdvertLoadedDeepLink;

    @l
    private final AdvertParameters parameters;

    @l
    private final String phone;

    @l
    private final Portfolio portfolio;

    @l
    private final PremierPartner premierPartner;

    @l
    private final Price price;

    @l
    private final PromoActivities promoActivities;

    @l
    private final List<PromoBlockData> promoBlockFeed;

    @l
    private final Boolean protection;

    @l
    private final PublishWarningBanner publishWarningBanner;

    @l
    private final RealtyOwnerVerification realtyOwnerVerification;

    @l
    private final List<RejectReason> reasons;

    @l
    private final String reasonsTitle;

    @l
    private final ReliableOwner reliableOwner;

    @l
    private final ReservationInfo reservationInfo;

    @l
    private final MyAdvertSafeDeal safeDealServices;

    @l
    private final Sales sales;

    @l
    private final SalesContract salesContract;

    @l
    private final SbStatusBlock sbStatusBlock;

    @l
    private final Seller seller;

    @l
    private final ServiceBookingReminderBlock serviceBookingReminderBlock;

    @l
    private final ServicesSellerSubscriptionBanner servicesSellerSubscriptionBanner;

    @l
    private final AdvertSharing sharing;

    @l
    private final Shop shop;

    @l
    private final AdvertSellerShortTermRent shortTermRent;

    @l
    private final Stats stats;

    @l
    private final BeduinV2 statsBeduin;

    @k
    private final String status;

    @l
    private final StockManagement stockManagement;

    @l
    private final SupportAutomation supportAutomation;

    @l
    private final AdvertDetailsFeaturesTeasers teasers;
    private final long time;

    @k
    private final String title;

    @k
    private final String toolbarTitle;

    @l
    private final String ttlHumanized;

    @k
    private final String userType;

    @l
    private final List<UxFeedbackConfigOld> uxFeedbackConfigs;

    @l
    private final List<DeepLink> uxFeedbackDeepLinks;

    @l
    private final MyAdvertVas vas;

    @l
    private final VasBundlesBanner vasBundlesBanner;

    @l
    private final Verification verification;

    @l
    private final List<BeduinAction> verificationRecommendationActions;

    @l
    private final Video video;

    @l
    private final String wizardId;

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ActivationInfo;", "Landroid/os/Parcelable;", "", "hint", "Lcom/avito/android/remote/model/Action;", "primaryAction", "secondaryAction", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Action;Lcom/avito/android/remote/model/Action;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHint", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Action;", "getPrimaryAction", "()Lcom/avito/android/remote/model/Action;", "getSecondaryAction", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActivationInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<ActivationInfo> CREATOR = new Creator();

        @c("hint")
        @l
        private final String hint;

        @c("primaryAction")
        @l
        private final Action primaryAction;

        @c("secondaryAction")
        @l
        private final Action secondaryAction;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActivationInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActivationInfo createFromParcel(@k Parcel parcel) {
                return new ActivationInfo(parcel.readString(), (Action) parcel.readParcelable(ActivationInfo.class.getClassLoader()), (Action) parcel.readParcelable(ActivationInfo.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActivationInfo[] newArray(int i12) {
                return new ActivationInfo[i12];
            }
        }

        public ActivationInfo(@l String str, @l Action action, @l Action action2) {
            this.hint = str;
            this.primaryAction = action;
            this.secondaryAction = action2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getHint() {
            return this.hint;
        }

        @l
        public final Action getPrimaryAction() {
            return this.primaryAction;
        }

        @l
        public final Action getSecondaryAction() {
            return this.secondaryAction;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.hint);
            parcel.writeParcelable(this.primaryAction, flags);
            parcel.writeParcelable(this.secondaryAction, flags);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Advantage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "universalImage", "", "title", "subtitle", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getUniversalImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Advantage implements Parcelable {

        @k
        public static final Parcelable.Creator<Advantage> CREATOR = new Creator();

        @c("subtitle")
        @k
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        @c("image")
        @k
        private final UniversalImage universalImage;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Advantage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Advantage createFromParcel(@k Parcel parcel) {
                return new Advantage((UniversalImage) parcel.readParcelable(Advantage.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Advantage[] newArray(int i12) {
                return new Advantage[i12];
            }
        }

        public Advantage(@k UniversalImage universalImage, @k String str, @k String str2) {
            this.universalImage = universalImage;
            this.title = str;
            this.subtitle = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final UniversalImage getUniversalImage() {
            return this.universalImage;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.universalImage, flags);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$AlertBanner;", "Landroid/os/Parcelable;", "", "title", "body", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/remote/model/Action;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Style;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Action;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getBody", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Style;", "getStyle", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Style;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/Action;", "getButton", "()Lcom/avito/android/remote/model/Action;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AlertBanner implements Parcelable {

        @k
        public static final Parcelable.Creator<AlertBanner> CREATOR = new Creator();

        @c("body")
        @l
        private final String body;

        @c("button")
        @l
        private final Action button;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @k
        private final Style style;

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AlertBanner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AlertBanner createFromParcel(@k Parcel parcel) {
                return new AlertBanner(parcel.readString(), parcel.readString(), Style.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(AlertBanner.class.getClassLoader()), (Action) parcel.readParcelable(AlertBanner.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AlertBanner[] newArray(int i12) {
                return new AlertBanner[i12];
            }
        }

        public AlertBanner(@k String str, @l String str2, @k Style style, @l DeepLink deepLink, @l Action action) {
            this.title = str;
            this.body = str2;
            this.style = style;
            this.uri = deepLink;
            this.button = action;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getBody() {
            return this.body;
        }

        @l
        public final Action getButton() {
            return this.button;
        }

        @k
        public final Style getStyle() {
            return this.style;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.body);
            parcel.writeString(this.style.name());
            parcel.writeParcelable(this.uri, flags);
            parcel.writeParcelable(this.button, flags);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$AutoPublish;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$AutoPublishSwitcher;", "switcher", "<init>", "(Lcom/avito/android/remote/model/adverts/MyAdvertDetails$AutoPublishSwitcher;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$AutoPublishSwitcher;", "getSwitcher", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$AutoPublishSwitcher;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AutoPublish implements Parcelable {

        @k
        public static final Parcelable.Creator<AutoPublish> CREATOR = new Creator();

        @c("switcher")
        @l
        private final AutoPublishSwitcher switcher;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoPublish> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoPublish createFromParcel(@k Parcel parcel) {
                return new AutoPublish(parcel.readInt() == 0 ? null : AutoPublishSwitcher.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoPublish[] newArray(int i12) {
                return new AutoPublish[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AutoPublish() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final AutoPublishSwitcher getSwitcher() {
            return this.switcher;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            AutoPublishSwitcher autoPublishSwitcher = this.switcher;
            if (autoPublishSwitcher == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                autoPublishSwitcher.writeToParcel(parcel, flags);
            }
        }

        public AutoPublish(@l AutoPublishSwitcher autoPublishSwitcher) {
            this.switcher = autoPublishSwitcher;
        }

        public /* synthetic */ AutoPublish(AutoPublishSwitcher autoPublishSwitcher, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : autoPublishSwitcher);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$AutoPublishSwitcher;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Switcher;", "", "id", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Boolean;", "getValue", "()Ljava/lang/Boolean;", "setValue", "(Ljava/lang/Boolean;)V", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AutoPublishSwitcher implements Switcher {

        @k
        public static final Parcelable.Creator<AutoPublishSwitcher> CREATOR = new Creator();

        @c("id")
        @k
        private final String id;

        @c("subtitle")
        @l
        private final AttributedText subtitle;

        @c("title")
        @k
        private final String title;

        @c("value")
        @l
        private Boolean value;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoPublishSwitcher> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoPublishSwitcher createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(AutoPublishSwitcher.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new AutoPublishSwitcher(string, string2, attributedText, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoPublishSwitcher[] newArray(int i12) {
                return new AutoPublishSwitcher[i12];
            }
        }

        public AutoPublishSwitcher(@k String str, @k String str2, @l AttributedText attributedText, @l Boolean bool) {
            this.id = str;
            this.title = str2;
            this.subtitle = attributedText;
            this.value = bool;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.adverts.MyAdvertDetails.Switcher
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.adverts.MyAdvertDetails.Switcher
        @l
        public AttributedText getSubtitle() {
            return this.subtitle;
        }

        @Override // com.avito.android.remote.model.adverts.MyAdvertDetails.Switcher
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.adverts.MyAdvertDetails.Switcher
        @l
        public Boolean getValue() {
            return this.value;
        }

        @Override // com.avito.android.remote.model.adverts.MyAdvertDetails.Switcher
        public void setValue(@l Boolean bool) {
            this.value = bool;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.subtitle, flags);
            Boolean bool = this.value;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BannerFromSxBanners;", "Landroid/os/Parcelable;", "", "context", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BannerFromSxBanners;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getContext", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BannerFromSxBanners implements Parcelable {

        @k
        public static final Parcelable.Creator<BannerFromSxBanners> CREATOR = new Creator();

        @c("context")
        @l
        private final String context;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BannerFromSxBanners> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BannerFromSxBanners createFromParcel(@k Parcel parcel) {
                return new BannerFromSxBanners(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BannerFromSxBanners[] newArray(int i12) {
                return new BannerFromSxBanners[i12];
            }
        }

        public BannerFromSxBanners(@l String str) {
            this.context = str;
        }

        public static /* synthetic */ BannerFromSxBanners copy$default(BannerFromSxBanners bannerFromSxBanners, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = bannerFromSxBanners.context;
            }
            return bannerFromSxBanners.copy(str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        @k
        public final BannerFromSxBanners copy(@l String context) {
            return new BannerFromSxBanners(context);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BannerFromSxBanners) && L.f(this.context, ((BannerFromSxBanners) other).context);
        }

        @l
        public final String getContext() {
            return this.context;
        }

        public int hashCode() {
            String str = this.context;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("BannerFromSxBanners(context="), this.context, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.context);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BuyoutPhone;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BuyoutPhone$BottomSheet;", "bottomSheet", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BuyoutPhone$Block;", "block", "<init>", "(Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BuyoutPhone$BottomSheet;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BuyoutPhone$Block;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BuyoutPhone$BottomSheet;", "getBottomSheet", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BuyoutPhone$BottomSheet;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BuyoutPhone$Block;", "getBlock", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BuyoutPhone$Block;", "Block", "BottomSheet", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class BuyoutPhone implements Parcelable {

        @k
        public static final Parcelable.Creator<BuyoutPhone> CREATOR = new Creator();

        @c("block")
        @l
        private final Block block;

        @c("bottomSheet")
        @l
        private final BottomSheet bottomSheet;

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BuyoutPhone$Block;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin_models/BeduinForm;", "form", "<init>", "(Lcom/avito/android/beduin_models/BeduinForm;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin_models/BeduinForm;", "getForm", "()Lcom/avito/android/beduin_models/BeduinForm;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Block implements Parcelable {

            @k
            public static final Parcelable.Creator<Block> CREATOR = new Creator();

            @c("form")
            @k
            private final BeduinForm form;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Block> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Block createFromParcel(@k Parcel parcel) {
                    return new Block((BeduinForm) parcel.readParcelable(Block.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Block[] newArray(int i12) {
                    return new Block[i12];
                }
            }

            public Block(@k BeduinForm beduinForm) {
                this.form = beduinForm;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final BeduinForm getForm() {
                return this.form;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.form, flags);
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$BuyoutPhone$BottomSheet;", "Landroid/os/Parcelable;", "", "_onlyForNewItem", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "getOnlyForNewItem", "()Z", "onlyForNewItem", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BottomSheet implements Parcelable {

            @k
            public static final Parcelable.Creator<BottomSheet> CREATOR = new Creator();

            @c("onlyForNewItem")
            @l
            private final Boolean _onlyForNewItem;

            @c("actions")
            @k
            private final List<BeduinAction> actions;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BottomSheet> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final BottomSheet createFromParcel(@k Parcel parcel) {
                    Boolean boolValueOf;
                    int iL2 = 0;
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    while (iL2 != i12) {
                        iL2 = a.l(BottomSheet.class, parcel, arrayList, iL2, 1);
                    }
                    return new BottomSheet(boolValueOf, arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final BottomSheet[] newArray(int i12) {
                    return new BottomSheet[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public BottomSheet(@l Boolean bool, @k List<? extends BeduinAction> list) {
                this._onlyForNewItem = bool;
                this.actions = list;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final List<BeduinAction> getActions() {
                return this.actions;
            }

            public final boolean getOnlyForNewItem() {
                Boolean bool = this._onlyForNewItem;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Boolean bool = this._onlyForNewItem;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                Iterator itJ = C0.j(this.actions, parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), flags);
                }
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BuyoutPhone> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BuyoutPhone createFromParcel(@k Parcel parcel) {
                return new BuyoutPhone(parcel.readInt() == 0 ? null : BottomSheet.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Block.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BuyoutPhone[] newArray(int i12) {
                return new BuyoutPhone[i12];
            }
        }

        public BuyoutPhone(@l BottomSheet bottomSheet, @l Block block) {
            this.bottomSheet = bottomSheet;
            this.block = block;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Block getBlock() {
            return this.block;
        }

        @l
        public final BottomSheet getBottomSheet() {
            return this.bottomSheet;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            BottomSheet bottomSheet = this.bottomSheet;
            if (bottomSheet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bottomSheet.writeToParcel(parcel, flags);
            }
            Block block = this.block;
            if (block == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                block.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b \u0010\u0019R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CadastralField;", "Landroid/os/Parcelable;", "", "title", "details", "Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", "aboutCadastral", ChannelContext.Item.PLACEHOLDER, "value", "validationRegexp", "validationErrorMessage", "emptyInputErrorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDetails", "Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", "getAboutCadastral", "()Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", "getPlaceholder", "getValue", "getValidationRegexp", "getValidationErrorMessage", "getEmptyInputErrorMessage", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CadastralField implements Parcelable {

        @k
        public static final Parcelable.Creator<CadastralField> CREATOR = new Creator();

        @c("aboutCadastral")
        @k
        private final DetailsSheetLinkBody aboutCadastral;

        @c("details")
        @k
        private final String details;

        @c("emptyInputErrorMessage")
        @k
        private final String emptyInputErrorMessage;

        @c(ChannelContext.Item.PLACEHOLDER)
        @k
        private final String placeholder;

        @c("title")
        @k
        private final String title;

        @c("validationErrorMessage")
        @k
        private final String validationErrorMessage;

        @c("validationRegexp")
        @k
        private final String validationRegexp;

        @c("value")
        @l
        private final String value;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CadastralField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CadastralField createFromParcel(@k Parcel parcel) {
                return new CadastralField(parcel.readString(), parcel.readString(), (DetailsSheetLinkBody) parcel.readParcelable(CadastralField.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CadastralField[] newArray(int i12) {
                return new CadastralField[i12];
            }
        }

        public CadastralField(@k String str, @k String str2, @k DetailsSheetLinkBody detailsSheetLinkBody, @k String str3, @l String str4, @k String str5, @k String str6, @k String str7) {
            this.title = str;
            this.details = str2;
            this.aboutCadastral = detailsSheetLinkBody;
            this.placeholder = str3;
            this.value = str4;
            this.validationRegexp = str5;
            this.validationErrorMessage = str6;
            this.emptyInputErrorMessage = str7;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final DetailsSheetLinkBody getAboutCadastral() {
            return this.aboutCadastral;
        }

        @k
        public final String getDetails() {
            return this.details;
        }

        @k
        public final String getEmptyInputErrorMessage() {
            return this.emptyInputErrorMessage;
        }

        @k
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String getValidationErrorMessage() {
            return this.validationErrorMessage;
        }

        @k
        public final String getValidationRegexp() {
            return this.validationRegexp;
        }

        @l
        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.details);
            parcel.writeParcelable(this.aboutCadastral, flags);
            parcel.writeString(this.placeholder);
            parcel.writeString(this.value);
            parcel.writeString(this.validationRegexp);
            parcel.writeString(this.validationErrorMessage);
            parcel.writeString(this.emptyInputErrorMessage);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CompetitorAnalyticsInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Action;", "action", "", "badgeText", "<init>", "(Lcom/avito/android/remote/model/Action;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "Ljava/lang/String;", "getBadgeText", "()Ljava/lang/String;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CompetitorAnalyticsInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<CompetitorAnalyticsInfo> CREATOR = new Creator();

        @c("action")
        @k
        private final Action action;

        @c("badgeText")
        @l
        private final String badgeText;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CompetitorAnalyticsInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CompetitorAnalyticsInfo createFromParcel(@k Parcel parcel) {
                return new CompetitorAnalyticsInfo((Action) parcel.readParcelable(CompetitorAnalyticsInfo.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CompetitorAnalyticsInfo[] newArray(int i12) {
                return new CompetitorAnalyticsInfo[i12];
            }
        }

        public CompetitorAnalyticsInfo(@k Action action, @l String str) {
            this.action = action;
            this.badgeText = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final Action getAction() {
            return this.action;
        }

        @l
        public final String getBadgeText() {
            return this.badgeText;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.action, flags);
            parcel.writeString(this.badgeText);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u000201B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0013¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$BblContact;", "bblContact", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData;", "historyData", "<init>", "(Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$BblContact;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData;)V", "component1", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$BblContact;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData;", "copy", "(Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$BblContact;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData;)Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$BblContact;", "getBblContact", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAction", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData;", "getHistoryData", "BblContact", "HistoryData", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ContactsBbl implements Parcelable {

        @k
        public static final Parcelable.Creator<ContactsBbl> CREATOR = new Creator();

        @c("action")
        @k
        private final DeepLink action;

        @c("bblContact")
        @k
        private final BblContact bblContact;

        @c("historyData")
        @l
        private final HistoryData historyData;

        @c("text")
        @k
        private final AttributedText text;

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rJ \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0013¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$BblContact;", "Landroid/os/Parcelable;", "", "count", "", "progress", "", "icon", "Lcom/avito/android/remote/model/UniversalColor;", "progressColor", "<init>", "(IFLjava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()I", "component2", "()F", "component3", "()Ljava/lang/String;", "component4", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(IFLjava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$BblContact;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getCount", "F", "getProgress", "Ljava/lang/String;", "getIcon", "Lcom/avito/android/remote/model/UniversalColor;", "getProgressColor", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BblContact implements Parcelable {

            @k
            public static final Parcelable.Creator<BblContact> CREATOR = new Creator();

            @c("count")
            private final int count;

            @c("icon")
            @l
            private final String icon;

            @c("progress")
            private final float progress;

            @c("progressColor")
            @l
            private final UniversalColor progressColor;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BblContact> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final BblContact createFromParcel(@k Parcel parcel) {
                    return new BblContact(parcel.readInt(), parcel.readFloat(), parcel.readString(), (UniversalColor) parcel.readParcelable(BblContact.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final BblContact[] newArray(int i12) {
                    return new BblContact[i12];
                }
            }

            public BblContact(int i12, float f12, @l String str, @l UniversalColor universalColor) {
                this.count = i12;
                this.progress = f12;
                this.icon = str;
                this.progressColor = universalColor;
            }

            public static /* synthetic */ BblContact copy$default(BblContact bblContact, int i12, float f12, String str, UniversalColor universalColor, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i12 = bblContact.count;
                }
                if ((i13 & 2) != 0) {
                    f12 = bblContact.progress;
                }
                if ((i13 & 4) != 0) {
                    str = bblContact.icon;
                }
                if ((i13 & 8) != 0) {
                    universalColor = bblContact.progressColor;
                }
                return bblContact.copy(i12, f12, str, universalColor);
            }

            /* renamed from: component1, reason: from getter */
            public final int getCount() {
                return this.count;
            }

            /* renamed from: component2, reason: from getter */
            public final float getProgress() {
                return this.progress;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final UniversalColor getProgressColor() {
                return this.progressColor;
            }

            @k
            public final BblContact copy(int count, float progress, @l String icon, @l UniversalColor progressColor) {
                return new BblContact(count, progress, icon, progressColor);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BblContact)) {
                    return false;
                }
                BblContact bblContact = (BblContact) other;
                return this.count == bblContact.count && Float.compare(this.progress, bblContact.progress) == 0 && L.f(this.icon, bblContact.icon) && L.f(this.progressColor, bblContact.progressColor);
            }

            public final int getCount() {
                return this.count;
            }

            @l
            public final String getIcon() {
                return this.icon;
            }

            public final float getProgress() {
                return this.progress;
            }

            @l
            public final UniversalColor getProgressColor() {
                return this.progressColor;
            }

            public int hashCode() {
                int iD2 = r.d(this.progress, Integer.hashCode(this.count) * 31, 31);
                String str = this.icon;
                int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                UniversalColor universalColor = this.progressColor;
                return iHashCode + (universalColor != null ? universalColor.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("BblContact(count=");
                sb2.append(this.count);
                sb2.append(", progress=");
                sb2.append(this.progress);
                sb2.append(", icon=");
                sb2.append(this.icon);
                sb2.append(", progressColor=");
                return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.progressColor, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(this.count);
                parcel.writeFloat(this.progress);
                parcel.writeString(this.icon);
                parcel.writeParcelable(this.progressColor, flags);
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ContactsBbl> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ContactsBbl createFromParcel(@k Parcel parcel) {
                return new ContactsBbl(BblContact.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(ContactsBbl.class.getClassLoader()), (DeepLink) parcel.readParcelable(ContactsBbl.class.getClassLoader()), parcel.readInt() == 0 ? null : HistoryData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ContactsBbl[] newArray(int i12) {
                return new ContactsBbl[i12];
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0003-./B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0011¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$HistoryItem;", "contactsInfo", "history", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$ContactsButton;", "buyContactsButton", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$BannerColor;", "bannerColor", "<init>", "(Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$HistoryItem;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$HistoryItem;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$ContactsButton;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$BannerColor;)V", "component1", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$HistoryItem;", "component2", "component3", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$ContactsButton;", "component4", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$BannerColor;", "copy", "(Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$HistoryItem;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$HistoryItem;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$ContactsButton;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$BannerColor;)Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$HistoryItem;", "getContactsInfo", "getHistory", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$ContactsButton;", "getBuyContactsButton", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$BannerColor;", "getBannerColor", "BannerColor", "ContactsButton", "HistoryItem", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class HistoryData implements Parcelable {

            @k
            public static final Parcelable.Creator<HistoryData> CREATOR = new Creator();

            @c("bannerBackgroundColor")
            @k
            private final BannerColor bannerColor;

            @c("buyContactsButton")
            @l
            private final ContactsButton buyContactsButton;

            @c("contactsInfo")
            @k
            private final HistoryItem contactsInfo;

            @c("history")
            @l
            private final HistoryItem history;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: MyAdvertDetails.kt */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$BannerColor;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "WARMGRAY", "RED", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class BannerColor implements Parcelable {
                private static final /* synthetic */ kotlin.enums.a $ENTRIES;
                private static final /* synthetic */ BannerColor[] $VALUES;

                @k
                public static final Parcelable.Creator<BannerColor> CREATOR;

                @c("warmGray")
                public static final BannerColor WARMGRAY = new BannerColor("WARMGRAY", 0);

                @c("red")
                public static final BannerColor RED = new BannerColor("RED", 1);

                /* compiled from: MyAdvertDetails.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<BannerColor> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final BannerColor createFromParcel(@k Parcel parcel) {
                        return BannerColor.valueOf(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final BannerColor[] newArray(int i12) {
                        return new BannerColor[i12];
                    }
                }

                private static final /* synthetic */ BannerColor[] $values() {
                    return new BannerColor[]{WARMGRAY, RED};
                }

                static {
                    BannerColor[] bannerColorArr$values = $values();
                    $VALUES = bannerColorArr$values;
                    $ENTRIES = kotlin.enums.c.a(bannerColorArr$values);
                    CREATOR = new Creator();
                }

                private BannerColor(String str, int i12) {
                }

                @k
                public static kotlin.enums.a<BannerColor> getEntries() {
                    return $ENTRIES;
                }

                public static BannerColor valueOf(String str) {
                    return (BannerColor) Enum.valueOf(BannerColor.class, str);
                }

                public static BannerColor[] values() {
                    return (BannerColor[]) $VALUES.clone();
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(name());
                }
            }

            /* compiled from: MyAdvertDetails.kt */
            @d
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$ContactsButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$ContactsButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class ContactsButton implements Parcelable {

                @k
                public static final Parcelable.Creator<ContactsButton> CREATOR = new Creator();

                @c("title")
                @k
                private final String title;

                @c(TooltipAttribute.PARAM_DEEP_LINK)
                @k
                private final DeepLink uri;

                /* compiled from: MyAdvertDetails.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ContactsButton> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ContactsButton createFromParcel(@k Parcel parcel) {
                        return new ContactsButton(parcel.readString(), (DeepLink) parcel.readParcelable(ContactsButton.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ContactsButton[] newArray(int i12) {
                        return new ContactsButton[i12];
                    }
                }

                public ContactsButton(@k String str, @k DeepLink deepLink) {
                    this.title = str;
                    this.uri = deepLink;
                }

                public static /* synthetic */ ContactsButton copy$default(ContactsButton contactsButton, String str, DeepLink deepLink, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = contactsButton.title;
                    }
                    if ((i12 & 2) != 0) {
                        deepLink = contactsButton.uri;
                    }
                    return contactsButton.copy(str, deepLink);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final DeepLink getUri() {
                    return this.uri;
                }

                @k
                public final ContactsButton copy(@k String title, @k DeepLink uri) {
                    return new ContactsButton(title, uri);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ContactsButton)) {
                        return false;
                    }
                    ContactsButton contactsButton = (ContactsButton) other;
                    return L.f(this.title, contactsButton.title) && L.f(this.uri, contactsButton.uri);
                }

                @k
                public final String getTitle() {
                    return this.title;
                }

                @k
                public final DeepLink getUri() {
                    return this.uri;
                }

                public int hashCode() {
                    return this.uri.hashCode() + (this.title.hashCode() * 31);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("ContactsButton(title=");
                    sb2.append(this.title);
                    sb2.append(", uri=");
                    return a.v(sb2, this.uri, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.title);
                    parcel.writeParcelable(this.uri, flags);
                }
            }

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<HistoryData> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final HistoryData createFromParcel(@k Parcel parcel) {
                    Parcelable.Creator<HistoryItem> creator = HistoryItem.CREATOR;
                    return new HistoryData(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? ContactsButton.CREATOR.createFromParcel(parcel) : null, BannerColor.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final HistoryData[] newArray(int i12) {
                    return new HistoryData[i12];
                }
            }

            /* compiled from: MyAdvertDetails.kt */
            @d
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$HistoryItem;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ContactsBbl$HistoryData$HistoryItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAction", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class HistoryItem implements Parcelable {

                @k
                public static final Parcelable.Creator<HistoryItem> CREATOR = new Creator();

                @c("action")
                @k
                private final DeepLink action;

                @c("title")
                @k
                private final String title;

                /* compiled from: MyAdvertDetails.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<HistoryItem> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final HistoryItem createFromParcel(@k Parcel parcel) {
                        return new HistoryItem(parcel.readString(), (DeepLink) parcel.readParcelable(HistoryItem.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final HistoryItem[] newArray(int i12) {
                        return new HistoryItem[i12];
                    }
                }

                public HistoryItem(@k String str, @k DeepLink deepLink) {
                    this.title = str;
                    this.action = deepLink;
                }

                public static /* synthetic */ HistoryItem copy$default(HistoryItem historyItem, String str, DeepLink deepLink, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = historyItem.title;
                    }
                    if ((i12 & 2) != 0) {
                        deepLink = historyItem.action;
                    }
                    return historyItem.copy(str, deepLink);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final DeepLink getAction() {
                    return this.action;
                }

                @k
                public final HistoryItem copy(@k String title, @k DeepLink action) {
                    return new HistoryItem(title, action);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof HistoryItem)) {
                        return false;
                    }
                    HistoryItem historyItem = (HistoryItem) other;
                    return L.f(this.title, historyItem.title) && L.f(this.action, historyItem.action);
                }

                @k
                public final DeepLink getAction() {
                    return this.action;
                }

                @k
                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.action.hashCode() + (this.title.hashCode() * 31);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("HistoryItem(title=");
                    sb2.append(this.title);
                    sb2.append(", action=");
                    return a.v(sb2, this.action, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.title);
                    parcel.writeParcelable(this.action, flags);
                }
            }

            public HistoryData(@k HistoryItem historyItem, @l HistoryItem historyItem2, @l ContactsButton contactsButton, @k BannerColor bannerColor) {
                this.contactsInfo = historyItem;
                this.history = historyItem2;
                this.buyContactsButton = contactsButton;
                this.bannerColor = bannerColor;
            }

            public static /* synthetic */ HistoryData copy$default(HistoryData historyData, HistoryItem historyItem, HistoryItem historyItem2, ContactsButton contactsButton, BannerColor bannerColor, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    historyItem = historyData.contactsInfo;
                }
                if ((i12 & 2) != 0) {
                    historyItem2 = historyData.history;
                }
                if ((i12 & 4) != 0) {
                    contactsButton = historyData.buyContactsButton;
                }
                if ((i12 & 8) != 0) {
                    bannerColor = historyData.bannerColor;
                }
                return historyData.copy(historyItem, historyItem2, contactsButton, bannerColor);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final HistoryItem getContactsInfo() {
                return this.contactsInfo;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final HistoryItem getHistory() {
                return this.history;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final ContactsButton getBuyContactsButton() {
                return this.buyContactsButton;
            }

            @k
            /* renamed from: component4, reason: from getter */
            public final BannerColor getBannerColor() {
                return this.bannerColor;
            }

            @k
            public final HistoryData copy(@k HistoryItem contactsInfo, @l HistoryItem history, @l ContactsButton buyContactsButton, @k BannerColor bannerColor) {
                return new HistoryData(contactsInfo, history, buyContactsButton, bannerColor);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HistoryData)) {
                    return false;
                }
                HistoryData historyData = (HistoryData) other;
                return L.f(this.contactsInfo, historyData.contactsInfo) && L.f(this.history, historyData.history) && L.f(this.buyContactsButton, historyData.buyContactsButton) && this.bannerColor == historyData.bannerColor;
            }

            @k
            public final BannerColor getBannerColor() {
                return this.bannerColor;
            }

            @l
            public final ContactsButton getBuyContactsButton() {
                return this.buyContactsButton;
            }

            @k
            public final HistoryItem getContactsInfo() {
                return this.contactsInfo;
            }

            @l
            public final HistoryItem getHistory() {
                return this.history;
            }

            public int hashCode() {
                int iHashCode = this.contactsInfo.hashCode() * 31;
                HistoryItem historyItem = this.history;
                int iHashCode2 = (iHashCode + (historyItem == null ? 0 : historyItem.hashCode())) * 31;
                ContactsButton contactsButton = this.buyContactsButton;
                return this.bannerColor.hashCode() + ((iHashCode2 + (contactsButton != null ? contactsButton.hashCode() : 0)) * 31);
            }

            @k
            public String toString() {
                return "HistoryData(contactsInfo=" + this.contactsInfo + ", history=" + this.history + ", buyContactsButton=" + this.buyContactsButton + ", bannerColor=" + this.bannerColor + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                this.contactsInfo.writeToParcel(parcel, flags);
                HistoryItem historyItem = this.history;
                if (historyItem == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    historyItem.writeToParcel(parcel, flags);
                }
                ContactsButton contactsButton = this.buyContactsButton;
                if (contactsButton == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    contactsButton.writeToParcel(parcel, flags);
                }
                this.bannerColor.writeToParcel(parcel, flags);
            }
        }

        public ContactsBbl(@k BblContact bblContact, @k AttributedText attributedText, @k DeepLink deepLink, @l HistoryData historyData) {
            this.bblContact = bblContact;
            this.text = attributedText;
            this.action = deepLink;
            this.historyData = historyData;
        }

        public static /* synthetic */ ContactsBbl copy$default(ContactsBbl contactsBbl, BblContact bblContact, AttributedText attributedText, DeepLink deepLink, HistoryData historyData, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                bblContact = contactsBbl.bblContact;
            }
            if ((i12 & 2) != 0) {
                attributedText = contactsBbl.text;
            }
            if ((i12 & 4) != 0) {
                deepLink = contactsBbl.action;
            }
            if ((i12 & 8) != 0) {
                historyData = contactsBbl.historyData;
            }
            return contactsBbl.copy(bblContact, attributedText, deepLink, historyData);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final BblContact getBblContact() {
            return this.bblContact;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final DeepLink getAction() {
            return this.action;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final HistoryData getHistoryData() {
            return this.historyData;
        }

        @k
        public final ContactsBbl copy(@k BblContact bblContact, @k AttributedText text, @k DeepLink action, @l HistoryData historyData) {
            return new ContactsBbl(bblContact, text, action, historyData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContactsBbl)) {
                return false;
            }
            ContactsBbl contactsBbl = (ContactsBbl) other;
            return L.f(this.bblContact, contactsBbl.bblContact) && L.f(this.text, contactsBbl.text) && L.f(this.action, contactsBbl.action) && L.f(this.historyData, contactsBbl.historyData);
        }

        @k
        public final DeepLink getAction() {
            return this.action;
        }

        @k
        public final BblContact getBblContact() {
            return this.bblContact;
        }

        @l
        public final HistoryData getHistoryData() {
            return this.historyData;
        }

        @k
        public final AttributedText getText() {
            return this.text;
        }

        public int hashCode() {
            int iE2 = a.e(this.action, a.b(this.bblContact.hashCode() * 31, 31, this.text), 31);
            HistoryData historyData = this.historyData;
            return iE2 + (historyData == null ? 0 : historyData.hashCode());
        }

        @k
        public String toString() {
            return "ContactsBbl(bblContact=" + this.bblContact + ", text=" + this.text + ", action=" + this.action + ", historyData=" + this.historyData + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.bblContact.writeToParcel(parcel, flags);
            parcel.writeParcelable(this.text, flags);
            parcel.writeParcelable(this.action, flags);
            HistoryData historyData = this.historyData;
            if (historyData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                historyData.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CopyAdvertTooltip;", "Landroid/os/Parcelable;", "", "title", "body", "buttonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CopyAdvertTooltip;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getBody", "getButtonText", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CopyAdvertTooltip implements Parcelable {

        @k
        public static final Parcelable.Creator<CopyAdvertTooltip> CREATOR = new Creator();

        @c("body")
        @k
        private final String body;

        @c("buttonText")
        @k
        private final String buttonText;

        @c("title")
        @k
        private final String title;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CopyAdvertTooltip> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CopyAdvertTooltip createFromParcel(@k Parcel parcel) {
                return new CopyAdvertTooltip(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CopyAdvertTooltip[] newArray(int i12) {
                return new CopyAdvertTooltip[i12];
            }
        }

        public CopyAdvertTooltip(@k String str, @k String str2, @k String str3) {
            this.title = str;
            this.body = str2;
            this.buttonText = str3;
        }

        public static /* synthetic */ CopyAdvertTooltip copy$default(CopyAdvertTooltip copyAdvertTooltip, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = copyAdvertTooltip.title;
            }
            if ((i12 & 2) != 0) {
                str2 = copyAdvertTooltip.body;
            }
            if ((i12 & 4) != 0) {
                str3 = copyAdvertTooltip.buttonText;
            }
            return copyAdvertTooltip.copy(str, str2, str3);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        @k
        public final CopyAdvertTooltip copy(@k String title, @k String body, @k String buttonText) {
            return new CopyAdvertTooltip(title, body, buttonText);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CopyAdvertTooltip)) {
                return false;
            }
            CopyAdvertTooltip copyAdvertTooltip = (CopyAdvertTooltip) other;
            return L.f(this.title, copyAdvertTooltip.title) && L.f(this.body, copyAdvertTooltip.body) && L.f(this.buttonText, copyAdvertTooltip.buttonText);
        }

        @k
        public final String getBody() {
            return this.body;
        }

        @k
        public final String getButtonText() {
            return this.buttonText;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.buttonText.hashCode() + H.d(this.title.hashCode() * 31, 31, this.body);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CopyAdvertTooltip(title=");
            sb2.append(this.title);
            sb2.append(", body=");
            sb2.append(this.body);
            sb2.append(", buttonText=");
            return C22026a.c(sb2, this.buttonText, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.body);
            parcel.writeString(this.buttonText);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CreditInfoItem;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "icon", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getIcon", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CreditInfoItem implements Parcelable {

        @k
        public static final Parcelable.Creator<CreditInfoItem> CREATOR = new Creator();

        @c("icon")
        @l
        private final String icon;

        @c("subtitle")
        @l
        private final AttributedText subtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CreditInfoItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CreditInfoItem createFromParcel(@k Parcel parcel) {
                return new CreditInfoItem(parcel.readString(), (AttributedText) parcel.readParcelable(CreditInfoItem.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CreditInfoItem[] newArray(int i12) {
                return new CreditInfoItem[i12];
            }
        }

        public CreditInfoItem(@k String str, @l AttributedText attributedText, @l String str2) {
            this.title = str;
            this.subtitle = attributedText;
            this.icon = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getIcon() {
            return this.icon;
        }

        @l
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.subtitle, flags);
            parcel.writeString(this.icon);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$DeliverySettings;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin_models/BeduinForm;", "form", "", "requestUrl", "<init>", "(Lcom/avito/android/beduin_models/BeduinForm;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin_models/BeduinForm;", "getForm", "()Lcom/avito/android/beduin_models/BeduinForm;", "setForm", "(Lcom/avito/android/beduin_models/BeduinForm;)V", "Ljava/lang/String;", "getRequestUrl", "()Ljava/lang/String;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DeliverySettings implements Parcelable {

        @k
        public static final Parcelable.Creator<DeliverySettings> CREATOR = new Creator();

        @c("form")
        @k
        private BeduinForm form;

        @c("requestUrl")
        @l
        private final String requestUrl;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DeliverySettings> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DeliverySettings createFromParcel(@k Parcel parcel) {
                return new DeliverySettings((BeduinForm) parcel.readParcelable(DeliverySettings.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DeliverySettings[] newArray(int i12) {
                return new DeliverySettings[i12];
            }
        }

        public DeliverySettings(@k BeduinForm beduinForm, @l String str) {
            this.form = beduinForm;
            this.requestUrl = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final BeduinForm getForm() {
            return this.form;
        }

        @l
        public final String getRequestUrl() {
            return this.requestUrl;
        }

        public final void setForm(@k BeduinForm beduinForm) {
            this.form = beduinForm;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.form, flags);
            parcel.writeString(this.requestUrl);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\"\u0010\u001e¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$EntryPointToAccountOwnerBanner;", "Landroid/os/Parcelable;", "", "dealId", "", "title", "", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Advantage;", "advantages", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MainButtonAction;", "action", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ExtraAction;", "extraActions", "<init>", "(ILjava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MainButtonAction;Ljava/util/List;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getDealId", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getAdvantages", "()Ljava/util/List;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MainButtonAction;", "getAction", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MainButtonAction;", "getExtraActions", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EntryPointToAccountOwnerBanner implements Parcelable {

        @k
        public static final Parcelable.Creator<EntryPointToAccountOwnerBanner> CREATOR = new Creator();

        @c("action")
        @k
        private final MainButtonAction action;

        @c("advantages")
        @k
        private final List<Advantage> advantages;

        @c("deal_id")
        private final int dealId;

        @c("extraOptions")
        @k
        private final List<ExtraAction> extraActions;

        @c("title")
        @k
        private final String title;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EntryPointToAccountOwnerBanner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EntryPointToAccountOwnerBanner createFromParcel(@k Parcel parcel) {
                int i12 = parcel.readInt();
                String string = parcel.readString();
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                int iC2 = 0;
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = a.c(Advantage.CREATOR, parcel, arrayList, iC3, 1);
                }
                MainButtonAction mainButtonActionCreateFromParcel = MainButtonAction.CREATOR.createFromParcel(parcel);
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                while (iC2 != i14) {
                    iC2 = a.c(ExtraAction.CREATOR, parcel, arrayList2, iC2, 1);
                }
                return new EntryPointToAccountOwnerBanner(i12, string, arrayList, mainButtonActionCreateFromParcel, arrayList2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EntryPointToAccountOwnerBanner[] newArray(int i12) {
                return new EntryPointToAccountOwnerBanner[i12];
            }
        }

        public EntryPointToAccountOwnerBanner(int i12, @k String str, @k List<Advantage> list, @k MainButtonAction mainButtonAction, @k List<ExtraAction> list2) {
            this.dealId = i12;
            this.title = str;
            this.advantages = list;
            this.action = mainButtonAction;
            this.extraActions = list2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final MainButtonAction getAction() {
            return this.action;
        }

        @k
        public final List<Advantage> getAdvantages() {
            return this.advantages;
        }

        public final int getDealId() {
            return this.dealId;
        }

        @k
        public final List<ExtraAction> getExtraActions() {
            return this.extraActions;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.dealId);
            parcel.writeString(this.title);
            Iterator itJ = C0.j(this.advantages, parcel);
            while (itJ.hasNext()) {
                ((Advantage) itJ.next()).writeToParcel(parcel, flags);
            }
            this.action.writeToParcel(parcel, flags);
            Iterator itJ2 = C0.j(this.extraActions, parcel);
            while (itJ2.hasNext()) {
                ((ExtraAction) itJ2.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ExtendedImage;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/Image;", "image", "originalImage", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "getOriginalImage", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ExtendedImage implements Parcelable {

        @k
        public static final Parcelable.Creator<ExtendedImage> CREATOR = new Creator();

        @c(ContextActionHandler.Link.URL)
        @k
        private final Image image;

        @c("original")
        @l
        private final Image originalImage;

        @c("id")
        @k
        private final String title;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ExtendedImage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ExtendedImage createFromParcel(@k Parcel parcel) {
                return new ExtendedImage(parcel.readString(), (Image) parcel.readParcelable(ExtendedImage.class.getClassLoader()), (Image) parcel.readParcelable(ExtendedImage.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ExtendedImage[] newArray(int i12) {
                return new ExtendedImage[i12];
            }
        }

        public ExtendedImage(@k String str, @k Image image, @l Image image2) {
            this.title = str;
            this.image = image;
            this.originalImage = image2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final Image getImage() {
            return this.image;
        }

        @l
        public final Image getOriginalImage() {
            return this.originalImage;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.image, flags);
            parcel.writeParcelable(this.originalImage, flags);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$FashionAuthenticity;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/beduin_models/BeduinModel;", "content", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FashionAuthenticity implements Parcelable {

        @k
        public static final Parcelable.Creator<FashionAuthenticity> CREATOR = new Creator();

        @c("content")
        @k
        private final List<BeduinModel> content;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FashionAuthenticity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FashionAuthenticity createFromParcel(@k Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(FashionAuthenticity.class, parcel, arrayList, iL2, 1);
                }
                return new FashionAuthenticity(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FashionAuthenticity[] newArray(int i12) {
                return new FashionAuthenticity[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FashionAuthenticity(@k List<? extends BeduinModel> list) {
            this.content = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final List<BeduinModel> getContent() {
            return this.content;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Iterator itJ = C0.j(this.content, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$FillParametersBanner;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$FillParametersBanner$Action;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$FillParametersBanner$Action;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$FillParametersBanner$Action;", "getAction", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$FillParametersBanner$Action;", "Action", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class FillParametersBanner implements Parcelable {

        @k
        public static final Parcelable.Creator<FillParametersBanner> CREATOR = new Creator();

        @c("action")
        @l
        private final Action action;

        @c("description")
        @l
        private final String description;

        @c("title")
        @l
        private final String title;

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$FillParametersBanner$Action;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Action implements Parcelable {

            @k
            public static final Parcelable.Creator<Action> CREATOR = new Creator();

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @k
            private final DeepLink deepLink;

            @c("text")
            @l
            private final String text;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Action> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Action createFromParcel(@k Parcel parcel) {
                    return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Action[] newArray(int i12) {
                    return new Action[i12];
                }
            }

            public Action(@l String str, @k DeepLink deepLink) {
                this.text = str;
                this.deepLink = deepLink;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            @l
            public final String getText() {
                return this.text;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.text);
                parcel.writeParcelable(this.deepLink, flags);
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FillParametersBanner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FillParametersBanner createFromParcel(@k Parcel parcel) {
                return new FillParametersBanner(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FillParametersBanner[] newArray(int i12) {
                return new FillParametersBanner[i12];
            }
        }

        public FillParametersBanner(@l String str, @l String str2, @l Action action) {
            this.title = str;
            this.description = str2;
            this.action = action;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Action getAction() {
            return this.action;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            Action action = this.action;
            if (action == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                action.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ItemReviews;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ItemReviews$ItemReviewsHeader;", "header", "<init>", "(Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ItemReviews$ItemReviewsHeader;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ItemReviews$ItemReviewsHeader;", "getHeader", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ItemReviews$ItemReviewsHeader;", "ItemReviewsHeader", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ItemReviews implements Parcelable {

        @k
        public static final Parcelable.Creator<ItemReviews> CREATOR = new Creator();

        @c("header")
        @l
        private final ItemReviewsHeader header;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ItemReviews> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ItemReviews createFromParcel(@k Parcel parcel) {
                return new ItemReviews(parcel.readInt() == 0 ? null : ItemReviewsHeader.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ItemReviews[] newArray(int i12) {
                return new ItemReviews[i12];
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ItemReviews$ItemReviewsHeader;", "Landroid/os/Parcelable;", "", "scoreValue", "", "scoreText", "caption", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Float;", "getScoreValue", "()Ljava/lang/Float;", "Ljava/lang/String;", "getScoreText", "()Ljava/lang/String;", "getCaption", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ItemReviewsHeader implements Parcelable {

            @k
            public static final Parcelable.Creator<ItemReviewsHeader> CREATOR = new Creator();

            @c("caption")
            @k
            private final String caption;

            @c(Constants.DEEPLINK)
            @k
            private final DeepLink deeplink;

            @c("scoreText")
            @k
            private final String scoreText;

            @c("scoreValue")
            @l
            private final Float scoreValue;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ItemReviewsHeader> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ItemReviewsHeader createFromParcel(@k Parcel parcel) {
                    return new ItemReviewsHeader(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ItemReviewsHeader.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ItemReviewsHeader[] newArray(int i12) {
                    return new ItemReviewsHeader[i12];
                }
            }

            public ItemReviewsHeader(@l Float f12, @k String str, @k String str2, @k DeepLink deepLink) {
                this.scoreValue = f12;
                this.scoreText = str;
                this.caption = str2;
                this.deeplink = deepLink;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final String getCaption() {
                return this.caption;
            }

            @k
            public final DeepLink getDeeplink() {
                return this.deeplink;
            }

            @k
            public final String getScoreText() {
                return this.scoreText;
            }

            @l
            public final Float getScoreValue() {
                return this.scoreValue;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Float f12 = this.scoreValue;
                if (f12 == null) {
                    parcel.writeInt(0);
                } else {
                    a.B(parcel, 1, f12);
                }
                parcel.writeString(this.scoreText);
                parcel.writeString(this.caption);
                parcel.writeParcelable(this.deeplink, flags);
            }
        }

        public ItemReviews(@l ItemReviewsHeader itemReviewsHeader) {
            this.header = itemReviewsHeader;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final ItemReviewsHeader getHeader() {
            return this.header;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            ItemReviewsHeader itemReviewsHeader = this.header;
            if (itemReviewsHeader == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                itemReviewsHeader.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$JobListItem;", "Landroid/os/Parcelable;", "", "title", "subtitle", "leftIconName", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/adverts/MyAdvertDetails$JobListItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getLeftIconName", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class JobListItem implements Parcelable {

        @k
        public static final Parcelable.Creator<JobListItem> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deepLink;

        @c("leftIconName")
        @k
        private final String leftIconName;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<JobListItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final JobListItem createFromParcel(@k Parcel parcel) {
                return new JobListItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(JobListItem.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final JobListItem[] newArray(int i12) {
                return new JobListItem[i12];
            }
        }

        public JobListItem(@k String str, @l String str2, @k String str3, @k DeepLink deepLink) {
            this.title = str;
            this.subtitle = str2;
            this.leftIconName = str3;
            this.deepLink = deepLink;
        }

        public static /* synthetic */ JobListItem copy$default(JobListItem jobListItem, String str, String str2, String str3, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = jobListItem.title;
            }
            if ((i12 & 2) != 0) {
                str2 = jobListItem.subtitle;
            }
            if ((i12 & 4) != 0) {
                str3 = jobListItem.leftIconName;
            }
            if ((i12 & 8) != 0) {
                deepLink = jobListItem.deepLink;
            }
            return jobListItem.copy(str, str2, str3, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getLeftIconName() {
            return this.leftIconName;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final JobListItem copy(@k String title, @l String subtitle, @k String leftIconName, @k DeepLink deepLink) {
            return new JobListItem(title, subtitle, leftIconName, deepLink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JobListItem)) {
                return false;
            }
            JobListItem jobListItem = (JobListItem) other;
            return L.f(this.title, jobListItem.title) && L.f(this.subtitle, jobListItem.subtitle) && L.f(this.leftIconName, jobListItem.leftIconName) && L.f(this.deepLink, jobListItem.deepLink);
        }

        @k
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final String getLeftIconName() {
            return this.leftIconName;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            return this.deepLink.hashCode() + H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.leftIconName);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("JobListItem(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", leftIconName=");
            sb2.append(this.leftIconName);
            sb2.append(", deepLink=");
            return a.v(sb2, this.deepLink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.leftIconName);
            parcel.writeParcelable(this.deepLink, flags);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0002<=BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJb\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020!HÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020!HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b7\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010\u001d¨\u0006>"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner$ActionButton;", "actionButton", "footer", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner$ProgressBar;", "progress", "", "closeButton", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner$ActionButton;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner$ProgressBar;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "()Lcom/avito/android/remote/model/UniversalColor;", "component4", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner$ActionButton;", "component5", "component6", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner$ProgressBar;", "component7", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner$ActionButton;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner$ProgressBar;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner$ActionButton;", "getActionButton", "getFooter", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner$ProgressBar;", "getProgress", "Ljava/lang/Boolean;", "getCloseButton", "ActionButton", "ProgressBar", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class MachineryRentalBanner implements Parcelable {

        @k
        public static final Parcelable.Creator<MachineryRentalBanner> CREATOR = new Creator();

        @c("actionButton")
        @l
        private final ActionButton actionButton;

        @c("backgroundColor")
        @l
        private final UniversalColor backgroundColor;

        @c("isCloseButtonShow")
        @l
        private final Boolean closeButton;

        @c("subtitle")
        @l
        private final AttributedText description;

        @c("footer")
        @l
        private final AttributedText footer;

        @c("progress")
        @l
        private final ProgressBar progress;

        @c("title")
        @k
        private final String title;

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\t\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\n\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner$ActionButton;", "Landroid/os/Parcelable;", "", "title", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "isEnableButton", "isDisableButton", "isNeedRefresh", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getStyle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ActionButton implements Parcelable {

            @k
            public static final Parcelable.Creator<ActionButton> CREATOR = new Creator();

            @c(Constants.DEEPLINK)
            @l
            private final DeepLink deepLink;

            @c("isDisableButton")
            @l
            private final Boolean isDisableButton;

            @c("isEnableButton")
            @l
            private final Boolean isEnableButton;

            @c("isNeedRefresh")
            @l
            private final Boolean isNeedRefresh;

            @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
            @k
            private final String style;

            @c("title")
            @k
            private final String title;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ActionButton> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ActionButton createFromParcel(@k Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    DeepLink deepLink = (DeepLink) parcel.readParcelable(ActionButton.class.getClassLoader());
                    Boolean boolValueOf3 = null;
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() != 0) {
                        boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new ActionButton(string, string2, deepLink, boolValueOf, boolValueOf2, boolValueOf3);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ActionButton[] newArray(int i12) {
                    return new ActionButton[i12];
                }
            }

            public ActionButton(@k String str, @k String str2, @l DeepLink deepLink, @l Boolean bool, @l Boolean bool2, @l Boolean bool3) {
                this.title = str;
                this.style = str2;
                this.deepLink = deepLink;
                this.isEnableButton = bool;
                this.isDisableButton = bool2;
                this.isNeedRefresh = bool3;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            @k
            public final String getStyle() {
                return this.style;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: isDisableButton, reason: from getter */
            public final Boolean getIsDisableButton() {
                return this.isDisableButton;
            }

            @l
            /* renamed from: isEnableButton, reason: from getter */
            public final Boolean getIsEnableButton() {
                return this.isEnableButton;
            }

            @l
            /* renamed from: isNeedRefresh, reason: from getter */
            public final Boolean getIsNeedRefresh() {
                return this.isNeedRefresh;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.style);
                parcel.writeParcelable(this.deepLink, flags);
                Boolean bool = this.isEnableButton;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                Boolean bool2 = this.isDisableButton;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool2);
                }
                Boolean bool3 = this.isNeedRefresh;
                if (bool3 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool3);
                }
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MachineryRentalBanner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MachineryRentalBanner createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(MachineryRentalBanner.class.getClassLoader());
                UniversalColor universalColor = (UniversalColor) parcel.readParcelable(MachineryRentalBanner.class.getClassLoader());
                ActionButton actionButtonCreateFromParcel = parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel);
                AttributedText attributedText2 = (AttributedText) parcel.readParcelable(MachineryRentalBanner.class.getClassLoader());
                ProgressBar progressBarCreateFromParcel = parcel.readInt() == 0 ? null : ProgressBar.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new MachineryRentalBanner(string, attributedText, universalColor, actionButtonCreateFromParcel, attributedText2, progressBarCreateFromParcel, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MachineryRentalBanner[] newArray(int i12) {
                return new MachineryRentalBanner[i12];
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MachineryRentalBanner$ProgressBar;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "color", "tintColor", "", "currentStep", "countSteps", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;II)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getTintColor", "I", "getCurrentStep", "getCountSteps", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ProgressBar implements Parcelable {

            @k
            public static final Parcelable.Creator<ProgressBar> CREATOR = new Creator();

            @c("color")
            @k
            private final UniversalColor color;

            @c("countSteps")
            private final int countSteps;

            @c("currentStep")
            private final int currentStep;

            @c("tintColor")
            @k
            private final UniversalColor tintColor;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ProgressBar> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ProgressBar createFromParcel(@k Parcel parcel) {
                    return new ProgressBar((UniversalColor) parcel.readParcelable(ProgressBar.class.getClassLoader()), (UniversalColor) parcel.readParcelable(ProgressBar.class.getClassLoader()), parcel.readInt(), parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ProgressBar[] newArray(int i12) {
                    return new ProgressBar[i12];
                }
            }

            public ProgressBar(@k UniversalColor universalColor, @k UniversalColor universalColor2, int i12, int i13) {
                this.color = universalColor;
                this.tintColor = universalColor2;
                this.currentStep = i12;
                this.countSteps = i13;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final UniversalColor getColor() {
                return this.color;
            }

            public final int getCountSteps() {
                return this.countSteps;
            }

            public final int getCurrentStep() {
                return this.currentStep;
            }

            @k
            public final UniversalColor getTintColor() {
                return this.tintColor;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.color, flags);
                parcel.writeParcelable(this.tintColor, flags);
                parcel.writeInt(this.currentStep);
                parcel.writeInt(this.countSteps);
            }
        }

        public MachineryRentalBanner(@k String str, @l AttributedText attributedText, @l UniversalColor universalColor, @l ActionButton actionButton, @l AttributedText attributedText2, @l ProgressBar progressBar, @l Boolean bool) {
            this.title = str;
            this.description = attributedText;
            this.backgroundColor = universalColor;
            this.actionButton = actionButton;
            this.footer = attributedText2;
            this.progress = progressBar;
            this.closeButton = bool;
        }

        public static /* synthetic */ MachineryRentalBanner copy$default(MachineryRentalBanner machineryRentalBanner, String str, AttributedText attributedText, UniversalColor universalColor, ActionButton actionButton, AttributedText attributedText2, ProgressBar progressBar, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = machineryRentalBanner.title;
            }
            if ((i12 & 2) != 0) {
                attributedText = machineryRentalBanner.description;
            }
            AttributedText attributedText3 = attributedText;
            if ((i12 & 4) != 0) {
                universalColor = machineryRentalBanner.backgroundColor;
            }
            UniversalColor universalColor2 = universalColor;
            if ((i12 & 8) != 0) {
                actionButton = machineryRentalBanner.actionButton;
            }
            ActionButton actionButton2 = actionButton;
            if ((i12 & 16) != 0) {
                attributedText2 = machineryRentalBanner.footer;
            }
            AttributedText attributedText4 = attributedText2;
            if ((i12 & 32) != 0) {
                progressBar = machineryRentalBanner.progress;
            }
            ProgressBar progressBar2 = progressBar;
            if ((i12 & 64) != 0) {
                bool = machineryRentalBanner.closeButton;
            }
            return machineryRentalBanner.copy(str, attributedText3, universalColor2, actionButton2, attributedText4, progressBar2, bool);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final ActionButton getActionButton() {
            return this.actionButton;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final AttributedText getFooter() {
            return this.footer;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final ProgressBar getProgress() {
            return this.progress;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Boolean getCloseButton() {
            return this.closeButton;
        }

        @k
        public final MachineryRentalBanner copy(@k String title, @l AttributedText description, @l UniversalColor backgroundColor, @l ActionButton actionButton, @l AttributedText footer, @l ProgressBar progress, @l Boolean closeButton) {
            return new MachineryRentalBanner(title, description, backgroundColor, actionButton, footer, progress, closeButton);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MachineryRentalBanner)) {
                return false;
            }
            MachineryRentalBanner machineryRentalBanner = (MachineryRentalBanner) other;
            return L.f(this.title, machineryRentalBanner.title) && L.f(this.description, machineryRentalBanner.description) && L.f(this.backgroundColor, machineryRentalBanner.backgroundColor) && L.f(this.actionButton, machineryRentalBanner.actionButton) && L.f(this.footer, machineryRentalBanner.footer) && L.f(this.progress, machineryRentalBanner.progress) && L.f(this.closeButton, machineryRentalBanner.closeButton);
        }

        @l
        public final ActionButton getActionButton() {
            return this.actionButton;
        }

        @l
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        public final Boolean getCloseButton() {
            return this.closeButton;
        }

        @l
        public final AttributedText getDescription() {
            return this.description;
        }

        @l
        public final AttributedText getFooter() {
            return this.footer;
        }

        @l
        public final ProgressBar getProgress() {
            return this.progress;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            AttributedText attributedText = this.description;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            UniversalColor universalColor = this.backgroundColor;
            int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            ActionButton actionButton = this.actionButton;
            int iHashCode4 = (iHashCode3 + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
            AttributedText attributedText2 = this.footer;
            int iHashCode5 = (iHashCode4 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
            ProgressBar progressBar = this.progress;
            int iHashCode6 = (iHashCode5 + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
            Boolean bool = this.closeButton;
            return iHashCode6 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MachineryRentalBanner(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", backgroundColor=");
            sb2.append(this.backgroundColor);
            sb2.append(", actionButton=");
            sb2.append(this.actionButton);
            sb2.append(", footer=");
            sb2.append(this.footer);
            sb2.append(", progress=");
            sb2.append(this.progress);
            sb2.append(", closeButton=");
            return C0.g(sb2, this.closeButton, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.description, flags);
            parcel.writeParcelable(this.backgroundColor, flags);
            ActionButton actionButton = this.actionButton;
            if (actionButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                actionButton.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.footer, flags);
            ProgressBar progressBar = this.progress;
            if (progressBar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                progressBar.writeToParcel(parcel, flags);
            }
            Boolean bool = this.closeButton;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MainButtonAction;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MainButtonAction implements Parcelable {

        @k
        public static final Parcelable.Creator<MainButtonAction> CREATOR = new Creator();

        @c(ContextActionHandler.Link.DEEPLINK)
        @k
        private final DeepLink deepLink;

        @c("text")
        @k
        private final String text;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MainButtonAction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MainButtonAction createFromParcel(@k Parcel parcel) {
                return new MainButtonAction(parcel.readString(), (DeepLink) parcel.readParcelable(MainButtonAction.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MainButtonAction[] newArray(int i12) {
                return new MainButtonAction[i12];
            }
        }

        public MainButtonAction(@k String str, @k DeepLink deepLink) {
            this.text = str;
            this.deepLink = deepLink;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeParcelable(this.deepLink, flags);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\\\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u000eR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b.\u0010\u000e¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MultiAddresses;", "Landroid/os/Parcelable;", "", "title", "listScreenTitle", "addressesSubtitle", "locationSubtitle", "", "Lcom/avito/android/user_address_public/api/MultiAddressesItem;", "addresses", "location", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/adverts/MyAdvertDetails$MultiAddresses;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getListScreenTitle", "getAddressesSubtitle", "getLocationSubtitle", "Ljava/util/List;", "getAddresses", "getLocation", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MultiAddresses implements Parcelable {

        @k
        public static final Parcelable.Creator<MultiAddresses> CREATOR = new Creator();

        @c("addresses")
        @l
        private final List<MultiAddressesItem> addresses;

        @c("addressesSubtitle")
        @l
        private final String addressesSubtitle;

        @c("listScreenTitle")
        @l
        private final String listScreenTitle;

        @c("location")
        @l
        private final String location;

        @c("locationSubtitle")
        @l
        private final String locationSubtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MultiAddresses> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MultiAddresses createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = a.l(MultiAddresses.class, parcel, arrayList, iL2, 1);
                    }
                }
                return new MultiAddresses(string, string2, string3, string4, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MultiAddresses[] newArray(int i12) {
                return new MultiAddresses[i12];
            }
        }

        public MultiAddresses(@k String str, @l String str2, @l String str3, @l String str4, @l List<MultiAddressesItem> list, @l String str5) {
            this.title = str;
            this.listScreenTitle = str2;
            this.addressesSubtitle = str3;
            this.locationSubtitle = str4;
            this.addresses = list;
            this.location = str5;
        }

        public static /* synthetic */ MultiAddresses copy$default(MultiAddresses multiAddresses, String str, String str2, String str3, String str4, List list, String str5, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = multiAddresses.title;
            }
            if ((i12 & 2) != 0) {
                str2 = multiAddresses.listScreenTitle;
            }
            String str6 = str2;
            if ((i12 & 4) != 0) {
                str3 = multiAddresses.addressesSubtitle;
            }
            String str7 = str3;
            if ((i12 & 8) != 0) {
                str4 = multiAddresses.locationSubtitle;
            }
            String str8 = str4;
            if ((i12 & 16) != 0) {
                list = multiAddresses.addresses;
            }
            List list2 = list;
            if ((i12 & 32) != 0) {
                str5 = multiAddresses.location;
            }
            return multiAddresses.copy(str, str6, str7, str8, list2, str5);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getListScreenTitle() {
            return this.listScreenTitle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getAddressesSubtitle() {
            return this.addressesSubtitle;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getLocationSubtitle() {
            return this.locationSubtitle;
        }

        @l
        public final List<MultiAddressesItem> component5() {
            return this.addresses;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        @k
        public final MultiAddresses copy(@k String title, @l String listScreenTitle, @l String addressesSubtitle, @l String locationSubtitle, @l List<MultiAddressesItem> addresses, @l String location) {
            return new MultiAddresses(title, listScreenTitle, addressesSubtitle, locationSubtitle, addresses, location);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiAddresses)) {
                return false;
            }
            MultiAddresses multiAddresses = (MultiAddresses) other;
            return L.f(this.title, multiAddresses.title) && L.f(this.listScreenTitle, multiAddresses.listScreenTitle) && L.f(this.addressesSubtitle, multiAddresses.addressesSubtitle) && L.f(this.locationSubtitle, multiAddresses.locationSubtitle) && L.f(this.addresses, multiAddresses.addresses) && L.f(this.location, multiAddresses.location);
        }

        @l
        public final List<MultiAddressesItem> getAddresses() {
            return this.addresses;
        }

        @l
        public final String getAddressesSubtitle() {
            return this.addressesSubtitle;
        }

        @l
        public final String getListScreenTitle() {
            return this.listScreenTitle;
        }

        @l
        public final String getLocation() {
            return this.location;
        }

        @l
        public final String getLocationSubtitle() {
            return this.locationSubtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.listScreenTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.addressesSubtitle;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.locationSubtitle;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<MultiAddressesItem> list = this.addresses;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.location;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MultiAddresses(title=");
            sb2.append(this.title);
            sb2.append(", listScreenTitle=");
            sb2.append(this.listScreenTitle);
            sb2.append(", addressesSubtitle=");
            sb2.append(this.addressesSubtitle);
            sb2.append(", locationSubtitle=");
            sb2.append(this.locationSubtitle);
            sb2.append(", addresses=");
            sb2.append(this.addresses);
            sb2.append(", location=");
            return C22026a.c(sb2, this.location, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.listScreenTitle);
            parcel.writeString(this.addressesSubtitle);
            parcel.writeString(this.locationSubtitle);
            List<MultiAddressesItem> list = this.addresses;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), flags);
                }
            }
            parcel.writeString(this.location);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0004\u001e\u001f !B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$WidgetType;", "widgetType", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$EmptyPortfolio;", "emptyPortfolio", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$FilledPortfolio;", "filledPortfolio", "filledRedesignPortfolio", "<init>", "(Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$WidgetType;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$EmptyPortfolio;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$FilledPortfolio;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$FilledPortfolio;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$WidgetType;", "getWidgetType", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$WidgetType;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$EmptyPortfolio;", "getEmptyPortfolio", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$EmptyPortfolio;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$FilledPortfolio;", "getFilledPortfolio", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$FilledPortfolio;", "getFilledRedesignPortfolio", "EmptyPortfolio", "FilledPortfolio", "PortfolioAction", "WidgetType", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Portfolio implements Parcelable {

        @k
        public static final Parcelable.Creator<Portfolio> CREATOR = new Creator();

        @c("emptyPortfolio")
        @l
        private final EmptyPortfolio emptyPortfolio;

        @c("filledPortfolio")
        @l
        private final FilledPortfolio filledPortfolio;

        @c("filledRedesignPortfolio")
        @l
        private final FilledPortfolio filledRedesignPortfolio;

        @c("widgetType")
        @k
        private final WidgetType widgetType;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Portfolio> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Portfolio createFromParcel(@k Parcel parcel) {
                return new Portfolio(WidgetType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EmptyPortfolio.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FilledPortfolio.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FilledPortfolio.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Portfolio[] newArray(int i12) {
                return new Portfolio[i12];
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$EmptyPortfolio;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/Image;", "image", "", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$PortfolioAction;", "actions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class EmptyPortfolio implements Parcelable {

            @k
            public static final Parcelable.Creator<EmptyPortfolio> CREATOR = new Creator();

            @c("actions")
            @k
            private final List<PortfolioAction> actions;

            @c("description")
            @k
            private final String description;

            @c("image")
            @k
            private final Image image;

            @c("title")
            @k
            private final String title;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<EmptyPortfolio> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final EmptyPortfolio createFromParcel(@k Parcel parcel) {
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    Image image = (Image) parcel.readParcelable(EmptyPortfolio.class.getClassLoader());
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        arrayList.add(parcel.readInt() == 0 ? null : PortfolioAction.CREATOR.createFromParcel(parcel));
                    }
                    return new EmptyPortfolio(string, string2, image, arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final EmptyPortfolio[] newArray(int i12) {
                    return new EmptyPortfolio[i12];
                }
            }

            public EmptyPortfolio(@k String str, @k String str2, @k Image image, @k List<PortfolioAction> list) {
                this.title = str;
                this.description = str2;
                this.image = image;
                this.actions = list;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final List<PortfolioAction> getActions() {
                return this.actions;
            }

            @k
            public final String getDescription() {
                return this.description;
            }

            @k
            public final Image getImage() {
                return this.image;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
                parcel.writeParcelable(this.image, flags);
                Iterator itJ = C0.j(this.actions, parcel);
                while (itJ.hasNext()) {
                    PortfolioAction portfolioAction = (PortfolioAction) itJ.next();
                    if (portfolioAction == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        portfolioAction.writeToParcel(parcel, flags);
                    }
                }
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$FilledPortfolio;", "Landroid/os/Parcelable;", "", "title", "description", "", "toggleState", "", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$PortfolioAction;", "actions", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Z", "getToggleState", "()Z", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class FilledPortfolio implements Parcelable {

            @k
            public static final Parcelable.Creator<FilledPortfolio> CREATOR = new Creator();

            @c("actions")
            @k
            private final List<PortfolioAction> actions;

            @c("description")
            @l
            private final String description;

            @c("title")
            @k
            private final String title;

            @c("toggleState")
            private final boolean toggleState;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<FilledPortfolio> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final FilledPortfolio createFromParcel(@k Parcel parcel) {
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int iC2 = 0;
                    boolean z12 = parcel.readInt() != 0;
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    while (iC2 != i12) {
                        iC2 = a.c(PortfolioAction.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new FilledPortfolio(string, string2, z12, arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final FilledPortfolio[] newArray(int i12) {
                    return new FilledPortfolio[i12];
                }
            }

            public FilledPortfolio(@k String str, @l String str2, boolean z12, @k List<PortfolioAction> list) {
                this.title = str;
                this.description = str2;
                this.toggleState = z12;
                this.actions = list;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final List<PortfolioAction> getActions() {
                return this.actions;
            }

            @l
            public final String getDescription() {
                return this.description;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public final boolean getToggleState() {
                return this.toggleState;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
                parcel.writeInt(this.toggleState ? 1 : 0);
                Iterator itJ = C0.j(this.actions, parcel);
                while (itJ.hasNext()) {
                    ((PortfolioAction) itJ.next()).writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$PortfolioAction;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "actionType", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getActionType", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PortfolioAction implements Parcelable {

            @k
            public static final Parcelable.Creator<PortfolioAction> CREATOR = new Creator();

            @c("actionType")
            @k
            private final String actionType;

            @c("title")
            @k
            private final String title;

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @l
            private final DeepLink uri;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PortfolioAction> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final PortfolioAction createFromParcel(@k Parcel parcel) {
                    return new PortfolioAction(parcel.readString(), (DeepLink) parcel.readParcelable(PortfolioAction.class.getClassLoader()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final PortfolioAction[] newArray(int i12) {
                    return new PortfolioAction[i12];
                }
            }

            public PortfolioAction(@k String str, @l DeepLink deepLink, @k String str2) {
                this.title = str;
                this.uri = deepLink;
                this.actionType = str2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final String getActionType() {
                return this.actionType;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @l
            public final DeepLink getUri() {
                return this.uri;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeParcelable(this.uri, flags);
                parcel.writeString(this.actionType);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MyAdvertDetails.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Portfolio$WidgetType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "EMPTY", "FILLED", "FILLED_REDESIGN", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class WidgetType implements Parcelable {
            private static final /* synthetic */ kotlin.enums.a $ENTRIES;
            private static final /* synthetic */ WidgetType[] $VALUES;

            @k
            public static final Parcelable.Creator<WidgetType> CREATOR;

            @c("EMPTY")
            public static final WidgetType EMPTY = new WidgetType("EMPTY", 0);

            @c("FILLED")
            public static final WidgetType FILLED = new WidgetType("FILLED", 1);

            @c("FILLED_REDESIGN")
            public static final WidgetType FILLED_REDESIGN = new WidgetType("FILLED_REDESIGN", 2);

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<WidgetType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final WidgetType createFromParcel(@k Parcel parcel) {
                    return WidgetType.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final WidgetType[] newArray(int i12) {
                    return new WidgetType[i12];
                }
            }

            private static final /* synthetic */ WidgetType[] $values() {
                return new WidgetType[]{EMPTY, FILLED, FILLED_REDESIGN};
            }

            static {
                WidgetType[] widgetTypeArr$values = $values();
                $VALUES = widgetTypeArr$values;
                $ENTRIES = kotlin.enums.c.a(widgetTypeArr$values);
                CREATOR = new Creator();
            }

            private WidgetType(String str, int i12) {
            }

            @k
            public static kotlin.enums.a<WidgetType> getEntries() {
                return $ENTRIES;
            }

            public static WidgetType valueOf(String str) {
                return (WidgetType) Enum.valueOf(WidgetType.class, str);
            }

            public static WidgetType[] values() {
                return (WidgetType[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(name());
            }
        }

        public Portfolio(@k WidgetType widgetType, @l EmptyPortfolio emptyPortfolio, @l FilledPortfolio filledPortfolio, @l FilledPortfolio filledPortfolio2) {
            this.widgetType = widgetType;
            this.emptyPortfolio = emptyPortfolio;
            this.filledPortfolio = filledPortfolio;
            this.filledRedesignPortfolio = filledPortfolio2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final EmptyPortfolio getEmptyPortfolio() {
            return this.emptyPortfolio;
        }

        @l
        public final FilledPortfolio getFilledPortfolio() {
            return this.filledPortfolio;
        }

        @l
        public final FilledPortfolio getFilledRedesignPortfolio() {
            return this.filledRedesignPortfolio;
        }

        @k
        public final WidgetType getWidgetType() {
            return this.widgetType;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.widgetType.writeToParcel(parcel, flags);
            EmptyPortfolio emptyPortfolio = this.emptyPortfolio;
            if (emptyPortfolio == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                emptyPortfolio.writeToParcel(parcel, flags);
            }
            FilledPortfolio filledPortfolio = this.filledPortfolio;
            if (filledPortfolio == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                filledPortfolio.writeToParcel(parcel, flags);
            }
            FilledPortfolio filledPortfolio2 = this.filledRedesignPortfolio;
            if (filledPortfolio2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                filledPortfolio2.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Price;", "Landroid/os/Parcelable;", "", "title", "value", "metric", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getValue", "getMetric", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Price implements Parcelable {

        @k
        public static final Parcelable.Creator<Price> CREATOR = new Creator();

        @c("metric")
        @l
        private final String metric;

        @c("title")
        @l
        private final String title;

        @c("value")
        @k
        private final String value;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Price> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Price createFromParcel(@k Parcel parcel) {
                return new Price(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Price[] newArray(int i12) {
                return new Price[i12];
            }
        }

        public Price(@l String str, @k String str2, @l String str3) {
            this.title = str;
            this.value = str2;
            this.metric = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getMetric() {
            return this.metric;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.value);
            parcel.writeString(this.metric);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$PromoActivities;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin_models/BeduinForm;", "form", "<init>", "(Lcom/avito/android/beduin_models/BeduinForm;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin_models/BeduinForm;", "getForm", "()Lcom/avito/android/beduin_models/BeduinForm;", "setForm", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PromoActivities implements Parcelable {

        @k
        public static final Parcelable.Creator<PromoActivities> CREATOR = new Creator();

        @c("form")
        @k
        private BeduinForm form;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PromoActivities> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PromoActivities createFromParcel(@k Parcel parcel) {
                return new PromoActivities((BeduinForm) parcel.readParcelable(PromoActivities.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PromoActivities[] newArray(int i12) {
                return new PromoActivities[i12];
            }
        }

        public PromoActivities(@k BeduinForm beduinForm) {
            this.form = beduinForm;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final BeduinForm getForm() {
            return this.form;
        }

        public final void setForm(@k BeduinForm beduinForm) {
            this.form = beduinForm;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.form, flags);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$PublishWarningBanner;", "Landroid/os/Parcelable;", "", "description", "buttonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "getButtonTitle", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PublishWarningBanner implements Parcelable {

        @k
        public static final Parcelable.Creator<PublishWarningBanner> CREATOR = new Creator();

        @c("buttonTitle")
        @l
        private final String buttonTitle;

        @c("description")
        @l
        private final String description;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PublishWarningBanner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PublishWarningBanner createFromParcel(@k Parcel parcel) {
                return new PublishWarningBanner(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PublishWarningBanner[] newArray(int i12) {
                return new PublishWarningBanner[i12];
            }
        }

        public PublishWarningBanner(@l String str, @l String str2) {
            this.description = str;
            this.buttonTitle = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.description);
            parcel.writeString(this.buttonTitle);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$RealtyOwnerVerification;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$VerificationStatus;", "status", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CadastralField;", "cadastralField", "Lcom/avito/android/remote/model/SimpleAdvertAction;", "action", "<init>", "(Lcom/avito/android/remote/model/adverts/MyAdvertDetails$VerificationStatus;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CadastralField;Lcom/avito/android/remote/model/SimpleAdvertAction;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$VerificationStatus;", "getStatus", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$VerificationStatus;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CadastralField;", "getCadastralField", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$CadastralField;", "Lcom/avito/android/remote/model/SimpleAdvertAction;", "getAction", "()Lcom/avito/android/remote/model/SimpleAdvertAction;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RealtyOwnerVerification implements Parcelable {

        @k
        public static final Parcelable.Creator<RealtyOwnerVerification> CREATOR = new Creator();

        @c("action")
        @l
        private final SimpleAdvertAction action;

        @c("cadastralField")
        @l
        private final CadastralField cadastralField;

        @c("description")
        @k
        private final AttributedText description;

        @c("status")
        @k
        private final VerificationStatus status;

        @c("title")
        @k
        private final String title;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RealtyOwnerVerification> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final RealtyOwnerVerification createFromParcel(@k Parcel parcel) {
                return new RealtyOwnerVerification(VerificationStatus.valueOf(parcel.readString()), parcel.readString(), (AttributedText) parcel.readParcelable(RealtyOwnerVerification.class.getClassLoader()), parcel.readInt() == 0 ? null : CadastralField.CREATOR.createFromParcel(parcel), (SimpleAdvertAction) parcel.readParcelable(RealtyOwnerVerification.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final RealtyOwnerVerification[] newArray(int i12) {
                return new RealtyOwnerVerification[i12];
            }
        }

        public RealtyOwnerVerification(@k VerificationStatus verificationStatus, @k String str, @k AttributedText attributedText, @l CadastralField cadastralField, @l SimpleAdvertAction simpleAdvertAction) {
            this.status = verificationStatus;
            this.title = str;
            this.description = attributedText;
            this.cadastralField = cadastralField;
            this.action = simpleAdvertAction;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final SimpleAdvertAction getAction() {
            return this.action;
        }

        @l
        public final CadastralField getCadastralField() {
            return this.cadastralField;
        }

        @k
        public final AttributedText getDescription() {
            return this.description;
        }

        @k
        public final VerificationStatus getStatus() {
            return this.status;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.status.name());
            parcel.writeString(this.title);
            parcel.writeParcelable(this.description, flags);
            CadastralField cadastralField = this.cadastralField;
            if (cadastralField == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                cadastralField.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.action, flags);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001:\u0002./BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b'\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$ProgressBar;", "progressBar", "", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$Insight;", "insights", "Lcom/avito/android/remote/model/SimpleAction;", "action", "secondaryAction", "Lcom/avito/android/remote/model/text/AttributedText;", "footer", "Lcom/avito/android/remote/model/vertical_main/PromoStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$ProgressBar;Ljava/util/List;Lcom/avito/android/remote/model/SimpleAction;Lcom/avito/android/remote/model/SimpleAction;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/vertical_main/PromoStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$ProgressBar;", "getProgressBar", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$ProgressBar;", "Ljava/util/List;", "getInsights", "()Ljava/util/List;", "Lcom/avito/android/remote/model/SimpleAction;", "getAction", "()Lcom/avito/android/remote/model/SimpleAction;", "getSecondaryAction", "Lcom/avito/android/remote/model/text/AttributedText;", "getFooter", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "getStyle", "()Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "Insight", "ProgressBar", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ReliableOwner implements Parcelable {

        @k
        public static final Parcelable.Creator<ReliableOwner> CREATOR = new Creator();

        @c("action")
        @l
        private final SimpleAction action;

        @c("footer")
        @l
        private final AttributedText footer;

        @c("insights")
        @l
        private final List<Insight> insights;

        @c("progressBar")
        @l
        private final ProgressBar progressBar;

        @c("secondaryAction")
        @l
        private final SimpleAction secondaryAction;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final PromoStyle style;

        @c("title")
        @k
        private final String title;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ReliableOwner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ReliableOwner createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                ArrayList arrayList = null;
                ProgressBar progressBarCreateFromParcel = parcel.readInt() == 0 ? null : ProgressBar.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(Insight.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                return new ReliableOwner(string, progressBarCreateFromParcel, arrayList, (SimpleAction) parcel.readParcelable(ReliableOwner.class.getClassLoader()), (SimpleAction) parcel.readParcelable(ReliableOwner.class.getClassLoader()), (AttributedText) parcel.readParcelable(ReliableOwner.class.getClassLoader()), (PromoStyle) parcel.readParcelable(ReliableOwner.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ReliableOwner[] newArray(int i12) {
                return new ReliableOwner[i12];
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$Insight;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$Insight$Icon;", "icon", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$Insight$Icon;Lcom/avito/android/remote/model/text/AttributedText;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$Insight$Icon;", "getIcon", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$Insight$Icon;", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "Icon", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class Insight implements Parcelable {

            @k
            public static final Parcelable.Creator<Insight> CREATOR = new Creator();

            @c("icon")
            @l
            private final Icon icon;

            @c("text")
            @k
            private final AttributedText text;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Insight> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Insight createFromParcel(@k Parcel parcel) {
                    return new Insight(parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(Insight.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Insight[] newArray(int i12) {
                    return new Insight[i12];
                }
            }

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$Insight$Icon;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$Insight$Icon$Type;", "type", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$Insight$Icon$Type;Lcom/avito/android/remote/model/UniversalColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$Insight$Icon$Type;", "getType", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$Insight$Icon$Type;", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "()Lcom/avito/android/remote/model/UniversalColor;", "Type", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class Icon implements Parcelable {

                @k
                public static final Parcelable.Creator<Icon> CREATOR = new Creator();

                @c("color")
                @l
                private final UniversalColor color;

                @c("type")
                @k
                private final Type type;

                /* compiled from: MyAdvertDetails.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Icon> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Icon createFromParcel(@k Parcel parcel) {
                        return new Icon(Type.valueOf(parcel.readString()), (UniversalColor) parcel.readParcelable(Icon.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Icon[] newArray(int i12) {
                        return new Icon[i12];
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: MyAdvertDetails.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$Insight$Icon$Type;", "", "(Ljava/lang/String;I)V", "CLOSE", "CHECKMARK", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Type {
                    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
                    private static final /* synthetic */ Type[] $VALUES;

                    @c("close")
                    public static final Type CLOSE = new Type("CLOSE", 0);

                    @c("checkmark")
                    public static final Type CHECKMARK = new Type("CHECKMARK", 1);

                    private static final /* synthetic */ Type[] $values() {
                        return new Type[]{CLOSE, CHECKMARK};
                    }

                    static {
                        Type[] typeArr$values = $values();
                        $VALUES = typeArr$values;
                        $ENTRIES = kotlin.enums.c.a(typeArr$values);
                    }

                    private Type(String str, int i12) {
                    }

                    @k
                    public static kotlin.enums.a<Type> getEntries() {
                        return $ENTRIES;
                    }

                    public static Type valueOf(String str) {
                        return (Type) Enum.valueOf(Type.class, str);
                    }

                    public static Type[] values() {
                        return (Type[]) $VALUES.clone();
                    }
                }

                public Icon(@k Type type, @l UniversalColor universalColor) {
                    this.type = type;
                    this.color = universalColor;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @l
                public final UniversalColor getColor() {
                    return this.color;
                }

                @k
                public final Type getType() {
                    return this.type;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.type.name());
                    parcel.writeParcelable(this.color, flags);
                }
            }

            public Insight(@l Icon icon, @k AttributedText attributedText) {
                this.icon = icon;
                this.text = attributedText;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final Icon getIcon() {
                return this.icon;
            }

            @k
            public final AttributedText getText() {
                return this.text;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Icon icon = this.icon;
                if (icon == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    icon.writeToParcel(parcel, flags);
                }
                parcel.writeParcelable(this.text, flags);
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReliableOwner$ProgressBar;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "value", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;F)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "F", "getValue", "()F", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ProgressBar implements Parcelable {

            @k
            public static final Parcelable.Creator<ProgressBar> CREATOR = new Creator();

            @c("title")
            @k
            private final AttributedText title;

            @c("value")
            private final float value;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ProgressBar> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ProgressBar createFromParcel(@k Parcel parcel) {
                    return new ProgressBar((AttributedText) parcel.readParcelable(ProgressBar.class.getClassLoader()), parcel.readFloat());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ProgressBar[] newArray(int i12) {
                    return new ProgressBar[i12];
                }
            }

            public ProgressBar(@k AttributedText attributedText, float f12) {
                this.title = attributedText;
                this.value = f12;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final AttributedText getTitle() {
                return this.title;
            }

            public final float getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.title, flags);
                parcel.writeFloat(this.value);
            }
        }

        public ReliableOwner(@k String str, @l ProgressBar progressBar, @l List<Insight> list, @l SimpleAction simpleAction, @l SimpleAction simpleAction2, @l AttributedText attributedText, @l PromoStyle promoStyle) {
            this.title = str;
            this.progressBar = progressBar;
            this.insights = list;
            this.action = simpleAction;
            this.secondaryAction = simpleAction2;
            this.footer = attributedText;
            this.style = promoStyle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final SimpleAction getAction() {
            return this.action;
        }

        @l
        public final AttributedText getFooter() {
            return this.footer;
        }

        @l
        public final List<Insight> getInsights() {
            return this.insights;
        }

        @l
        public final ProgressBar getProgressBar() {
            return this.progressBar;
        }

        @l
        public final SimpleAction getSecondaryAction() {
            return this.secondaryAction;
        }

        @l
        public final PromoStyle getStyle() {
            return this.style;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            ProgressBar progressBar = this.progressBar;
            if (progressBar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                progressBar.writeToParcel(parcel, flags);
            }
            List<Insight> list = this.insights;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((Insight) itA.next()).writeToParcel(parcel, flags);
                }
            }
            parcel.writeParcelable(this.action, flags);
            parcel.writeParcelable(this.secondaryAction, flags);
            parcel.writeParcelable(this.footer, flags);
            parcel.writeParcelable(this.style, flags);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ReservationInfo;", "Landroid/os/Parcelable;", "", "hint", "Lcom/avito/android/remote/model/Action;", "action", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Action;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHint", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReservationInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<ReservationInfo> CREATOR = new Creator();

        @c("action")
        @k
        private final Action action;

        @c("hint")
        @l
        private final String hint;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ReservationInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ReservationInfo createFromParcel(@k Parcel parcel) {
                return new ReservationInfo(parcel.readString(), (Action) parcel.readParcelable(ReservationInfo.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ReservationInfo[] newArray(int i12) {
                return new ReservationInfo[i12];
            }
        }

        public ReservationInfo(@l String str, @k Action action) {
            this.hint = str;
            this.action = action;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final Action getAction() {
            return this.action;
        }

        @l
        public final String getHint() {
            return this.hint;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.hint);
            parcel.writeParcelable(this.action, flags);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SalesContract;", "Landroid/os/Parcelable;", "", "show", "", "title", "linkText", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getShow", "()Z", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getLinkText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SalesContract implements Parcelable {

        @k
        public static final Parcelable.Creator<SalesContract> CREATOR = new Creator();

        @c(ContextActionHandler.Link.DEEPLINK)
        @l
        private final DeepLink deepLink;

        @c("linkText")
        @l
        private final String linkText;

        @c("show")
        private final boolean show;

        @c("title")
        @l
        private final String title;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SalesContract> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SalesContract createFromParcel(@k Parcel parcel) {
                return new SalesContract(parcel.readInt() != 0, parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SalesContract.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SalesContract[] newArray(int i12) {
                return new SalesContract[i12];
            }
        }

        public SalesContract(boolean z12, @l String str, @l String str2, @l DeepLink deepLink) {
            this.show = z12;
            this.title = str;
            this.linkText = str2;
            this.deepLink = deepLink;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final String getLinkText() {
            return this.linkText;
        }

        public final boolean getShow() {
            return this.show;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.show ? 1 : 0);
            parcel.writeString(this.title);
            parcel.writeString(this.linkText);
            parcel.writeParcelable(this.deepLink, flags);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0002!\"B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock;", "Landroid/os/Parcelable;", "", "status", "Lcom/avito/android/remote/model/text/AttributedText;", "details", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock$Event;", "event", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock$Action;", "action", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock$Event;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock$Action;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDetails", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock$Event;", "getEvent", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock$Event;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock$Action;", "getAction", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock$Action;", "Action", "Event", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class SbStatusBlock implements Parcelable {

        @k
        public static final Parcelable.Creator<SbStatusBlock> CREATOR = new Creator();

        @c("action")
        @l
        private final Action action;

        @c("details")
        @k
        private final AttributedText details;

        @c("event")
        @l
        private final Event event;

        @c("status")
        @k
        private final String status;

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock$Action;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Action implements Parcelable {

            @k
            public static final Parcelable.Creator<Action> CREATOR = new Creator();

            @c("title")
            @k
            private final String title;

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @k
            private final DeepLink uri;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Action> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Action createFromParcel(@k Parcel parcel) {
                    return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Action[] newArray(int i12) {
                    return new Action[i12];
                }
            }

            public Action(@k String str, @k DeepLink deepLink) {
                this.title = str;
                this.uri = deepLink;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @k
            public final DeepLink getUri() {
                return this.uri;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeParcelable(this.uri, flags);
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SbStatusBlock> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SbStatusBlock createFromParcel(@k Parcel parcel) {
                return new SbStatusBlock(parcel.readString(), (AttributedText) parcel.readParcelable(SbStatusBlock.class.getClassLoader()), parcel.readInt() == 0 ? null : Event.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Action.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SbStatusBlock[] newArray(int i12) {
                return new SbStatusBlock[i12];
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock$Event;", "Landroid/os/Parcelable;", "", "fromPage", "actionType", "blockType", "bannerType", "eid", "uid", "iid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFromPage", "()Ljava/lang/String;", "getActionType", "getBlockType", "getBannerType", "getEid", "getUid", "getIid", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Event implements Parcelable {

            @k
            public static final Parcelable.Creator<Event> CREATOR = new Creator();

            @c("actionType")
            @l
            private final String actionType;

            @c("bannerType")
            @l
            private final String bannerType;

            @c("blockType")
            @l
            private final String blockType;

            @c("eid")
            @k
            private final String eid;

            @c("fromPage")
            @l
            private final String fromPage;

            @c("iid")
            @k
            private final String iid;

            @c("uid")
            @k
            private final String uid;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Event> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Event createFromParcel(@k Parcel parcel) {
                    return new Event(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Event[] newArray(int i12) {
                    return new Event[i12];
                }
            }

            public Event(@l String str, @l String str2, @l String str3, @l String str4, @k String str5, @k String str6, @k String str7) {
                this.fromPage = str;
                this.actionType = str2;
                this.blockType = str3;
                this.bannerType = str4;
                this.eid = str5;
                this.uid = str6;
                this.iid = str7;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final String getActionType() {
                return this.actionType;
            }

            @l
            public final String getBannerType() {
                return this.bannerType;
            }

            @l
            public final String getBlockType() {
                return this.blockType;
            }

            @k
            public final String getEid() {
                return this.eid;
            }

            @l
            public final String getFromPage() {
                return this.fromPage;
            }

            @k
            public final String getIid() {
                return this.iid;
            }

            @k
            public final String getUid() {
                return this.uid;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.fromPage);
                parcel.writeString(this.actionType);
                parcel.writeString(this.blockType);
                parcel.writeString(this.bannerType);
                parcel.writeString(this.eid);
                parcel.writeString(this.uid);
                parcel.writeString(this.iid);
            }
        }

        public SbStatusBlock(@k String str, @k AttributedText attributedText, @l Event event, @l Action action) {
            this.status = str;
            this.details = attributedText;
            this.event = event;
            this.action = action;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Action getAction() {
            return this.action;
        }

        @k
        public final AttributedText getDetails() {
            return this.details;
        }

        @l
        public final Event getEvent() {
            return this.event;
        }

        @k
        public final String getStatus() {
            return this.status;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.status);
            parcel.writeParcelable(this.details, flags);
            Event event = this.event;
            if (event == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                event.writeToParcel(parcel, flags);
            }
            Action action = this.action;
            if (action == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                action.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Seller;", "Landroid/os/Parcelable;", "", "title", "name", "manager", "postfix", "Lcom/avito/android/remote/model/Image;", "image", "summary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getName", "getManager", "getPostfix", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "getSummary", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Seller implements Parcelable {

        @k
        public static final Parcelable.Creator<Seller> CREATOR = new Creator();

        @c("images")
        @l
        private final Image image;

        @c("manager")
        @l
        private final String manager;

        @c("name")
        @l
        private final String name;

        @c("postfix")
        @l
        private final String postfix;

        @c("summary")
        @l
        private final String summary;

        @c("title")
        @l
        private final String title;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Seller> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Seller createFromParcel(@k Parcel parcel) {
                return new Seller(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(Seller.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Seller[] newArray(int i12) {
                return new Seller[i12];
            }
        }

        public Seller(@l String str, @l String str2, @l String str3, @l String str4, @l Image image, @l String str5) {
            this.title = str;
            this.name = str2;
            this.manager = str3;
            this.postfix = str4;
            this.image = image;
            this.summary = str5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        @l
        public final String getManager() {
            return this.manager;
        }

        @l
        public final String getName() {
            return this.name;
        }

        @l
        public final String getPostfix() {
            return this.postfix;
        }

        @l
        public final String getSummary() {
            return this.summary;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.name);
            parcel.writeString(this.manager);
            parcel.writeString(this.postfix);
            parcel.writeParcelable(this.image, flags);
            parcel.writeString(this.summary);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001:\u0003456BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock;", "Landroid/os/Parcelable;", "", "status", "subtitle", "description", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderAction;", "action", "Lcom/avito/android/remote/model/text/AttributedText;", "details", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock$Event;", "event", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderBannerType;", "bannerType", "", "closeDayTimeGap", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderStyle;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderAction;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock$Event;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderBannerType;Ljava/lang/Long;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "getSubtitle", "getDescription", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderStyle;", "getStyle", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderStyle;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderAction;", "getAction", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderAction;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDetails", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock$Event;", "getEvent", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SbStatusBlock$Event;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderBannerType;", "getBannerType", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderBannerType;", "Ljava/lang/Long;", "getCloseDayTimeGap", "()Ljava/lang/Long;", "SbReminderAction", "SbReminderBannerType", "SbReminderStyle", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ServiceBookingReminderBlock implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceBookingReminderBlock> CREATOR = new Creator();

        @c("action")
        @k
        private final SbReminderAction action;

        @c("bannerType")
        @k
        private final SbReminderBannerType bannerType;

        @c("closeDayTimeGap")
        @l
        private final Long closeDayTimeGap;

        @c("description")
        @l
        private final String description;

        @c("details")
        @k
        private final AttributedText details;

        @c("event")
        @l
        private final SbStatusBlock.Event event;

        @c("status")
        @k
        private final String status;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @k
        private final SbReminderStyle style;

        @c("subtitle")
        @k
        private final String subtitle;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ServiceBookingReminderBlock> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ServiceBookingReminderBlock createFromParcel(@k Parcel parcel) {
                return new ServiceBookingReminderBlock(parcel.readString(), parcel.readString(), parcel.readString(), SbReminderStyle.CREATOR.createFromParcel(parcel), SbReminderAction.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(ServiceBookingReminderBlock.class.getClassLoader()), parcel.readInt() == 0 ? null : SbStatusBlock.Event.CREATOR.createFromParcel(parcel), SbReminderBannerType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ServiceBookingReminderBlock[] newArray(int i12) {
                return new ServiceBookingReminderBlock[i12];
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderAction;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderAction$ActionStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderAction$ActionStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderAction$ActionStyle;", "getStyle", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderAction$ActionStyle;", "ActionStyle", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class SbReminderAction implements Parcelable {

            @k
            public static final Parcelable.Creator<SbReminderAction> CREATOR = new Creator();

            @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
            @k
            private final ActionStyle style;

            @c("title")
            @k
            private final String title;

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @k
            private final DeepLink uri;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: MyAdvertDetails.kt */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderAction$ActionStyle;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "PRIMARY", "OVERLAY", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class ActionStyle implements Parcelable {
                private static final /* synthetic */ kotlin.enums.a $ENTRIES;
                private static final /* synthetic */ ActionStyle[] $VALUES;

                @k
                public static final Parcelable.Creator<ActionStyle> CREATOR;

                @c("primary")
                public static final ActionStyle PRIMARY = new ActionStyle("PRIMARY", 0);

                @c("overlay")
                public static final ActionStyle OVERLAY = new ActionStyle("OVERLAY", 1);

                /* compiled from: MyAdvertDetails.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ActionStyle> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ActionStyle createFromParcel(@k Parcel parcel) {
                        return ActionStyle.valueOf(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ActionStyle[] newArray(int i12) {
                        return new ActionStyle[i12];
                    }
                }

                private static final /* synthetic */ ActionStyle[] $values() {
                    return new ActionStyle[]{PRIMARY, OVERLAY};
                }

                static {
                    ActionStyle[] actionStyleArr$values = $values();
                    $VALUES = actionStyleArr$values;
                    $ENTRIES = kotlin.enums.c.a(actionStyleArr$values);
                    CREATOR = new Creator();
                }

                private ActionStyle(String str, int i12) {
                }

                @k
                public static kotlin.enums.a<ActionStyle> getEntries() {
                    return $ENTRIES;
                }

                public static ActionStyle valueOf(String str) {
                    return (ActionStyle) Enum.valueOf(ActionStyle.class, str);
                }

                public static ActionStyle[] values() {
                    return (ActionStyle[]) $VALUES.clone();
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(name());
                }
            }

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SbReminderAction> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SbReminderAction createFromParcel(@k Parcel parcel) {
                    return new SbReminderAction(parcel.readString(), (DeepLink) parcel.readParcelable(SbReminderAction.class.getClassLoader()), ActionStyle.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SbReminderAction[] newArray(int i12) {
                    return new SbReminderAction[i12];
                }
            }

            public SbReminderAction(@k String str, @k DeepLink deepLink, @k ActionStyle actionStyle) {
                this.title = str;
                this.uri = deepLink;
                this.style = actionStyle;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final ActionStyle getStyle() {
                return this.style;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @k
            public final DeepLink getUri() {
                return this.uri;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeParcelable(this.uri, flags);
                this.style.writeToParcel(parcel, flags);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MyAdvertDetails.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderBannerType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "SCHEDULE_PRICE_LIST", "SCHEDULE_DISABLE", "SCHEDULE_IS_OVER", "SCHEDULE_SOON_ENDS", "SCHEDULE_NEED_UPDATE", "SCHEDULE_OK", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class SbReminderBannerType implements Parcelable {
            private static final /* synthetic */ kotlin.enums.a $ENTRIES;
            private static final /* synthetic */ SbReminderBannerType[] $VALUES;

            @k
            public static final Parcelable.Creator<SbReminderBannerType> CREATOR;

            @c("schedule_price_list")
            public static final SbReminderBannerType SCHEDULE_PRICE_LIST = new SbReminderBannerType("SCHEDULE_PRICE_LIST", 0);

            @c("schedule_disable")
            public static final SbReminderBannerType SCHEDULE_DISABLE = new SbReminderBannerType("SCHEDULE_DISABLE", 1);

            @c("schedule_is_over")
            public static final SbReminderBannerType SCHEDULE_IS_OVER = new SbReminderBannerType("SCHEDULE_IS_OVER", 2);

            @c("schedule_soon_ends")
            public static final SbReminderBannerType SCHEDULE_SOON_ENDS = new SbReminderBannerType("SCHEDULE_SOON_ENDS", 3);

            @c("schedule_need_update")
            public static final SbReminderBannerType SCHEDULE_NEED_UPDATE = new SbReminderBannerType("SCHEDULE_NEED_UPDATE", 4);

            @c("schedule_ok")
            public static final SbReminderBannerType SCHEDULE_OK = new SbReminderBannerType("SCHEDULE_OK", 5);

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SbReminderBannerType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SbReminderBannerType createFromParcel(@k Parcel parcel) {
                    return SbReminderBannerType.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SbReminderBannerType[] newArray(int i12) {
                    return new SbReminderBannerType[i12];
                }
            }

            private static final /* synthetic */ SbReminderBannerType[] $values() {
                return new SbReminderBannerType[]{SCHEDULE_PRICE_LIST, SCHEDULE_DISABLE, SCHEDULE_IS_OVER, SCHEDULE_SOON_ENDS, SCHEDULE_NEED_UPDATE, SCHEDULE_OK};
            }

            static {
                SbReminderBannerType[] sbReminderBannerTypeArr$values = $values();
                $VALUES = sbReminderBannerTypeArr$values;
                $ENTRIES = kotlin.enums.c.a(sbReminderBannerTypeArr$values);
                CREATOR = new Creator();
            }

            private SbReminderBannerType(String str, int i12) {
            }

            @k
            public static kotlin.enums.a<SbReminderBannerType> getEntries() {
                return $ENTRIES;
            }

            public static SbReminderBannerType valueOf(String str) {
                return (SbReminderBannerType) Enum.valueOf(SbReminderBannerType.class, str);
            }

            public static SbReminderBannerType[] values() {
                return (SbReminderBannerType[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MyAdvertDetails.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ServiceBookingReminderBlock$SbReminderStyle;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "WARMGRAY", "ORANGE", "RED", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class SbReminderStyle implements Parcelable {
            private static final /* synthetic */ kotlin.enums.a $ENTRIES;
            private static final /* synthetic */ SbReminderStyle[] $VALUES;

            @k
            public static final Parcelable.Creator<SbReminderStyle> CREATOR;

            @c("warmGray")
            public static final SbReminderStyle WARMGRAY = new SbReminderStyle("WARMGRAY", 0);

            @c("orange")
            public static final SbReminderStyle ORANGE = new SbReminderStyle("ORANGE", 1);

            @c("red")
            public static final SbReminderStyle RED = new SbReminderStyle("RED", 2);

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SbReminderStyle> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SbReminderStyle createFromParcel(@k Parcel parcel) {
                    return SbReminderStyle.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SbReminderStyle[] newArray(int i12) {
                    return new SbReminderStyle[i12];
                }
            }

            private static final /* synthetic */ SbReminderStyle[] $values() {
                return new SbReminderStyle[]{WARMGRAY, ORANGE, RED};
            }

            static {
                SbReminderStyle[] sbReminderStyleArr$values = $values();
                $VALUES = sbReminderStyleArr$values;
                $ENTRIES = kotlin.enums.c.a(sbReminderStyleArr$values);
                CREATOR = new Creator();
            }

            private SbReminderStyle(String str, int i12) {
            }

            @k
            public static kotlin.enums.a<SbReminderStyle> getEntries() {
                return $ENTRIES;
            }

            public static SbReminderStyle valueOf(String str) {
                return (SbReminderStyle) Enum.valueOf(SbReminderStyle.class, str);
            }

            public static SbReminderStyle[] values() {
                return (SbReminderStyle[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(name());
            }
        }

        public ServiceBookingReminderBlock(@k String str, @k String str2, @l String str3, @k SbReminderStyle sbReminderStyle, @k SbReminderAction sbReminderAction, @k AttributedText attributedText, @l SbStatusBlock.Event event, @k SbReminderBannerType sbReminderBannerType, @l Long l12) {
            this.status = str;
            this.subtitle = str2;
            this.description = str3;
            this.style = sbReminderStyle;
            this.action = sbReminderAction;
            this.details = attributedText;
            this.event = event;
            this.bannerType = sbReminderBannerType;
            this.closeDayTimeGap = l12;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final SbReminderAction getAction() {
            return this.action;
        }

        @k
        public final SbReminderBannerType getBannerType() {
            return this.bannerType;
        }

        @l
        public final Long getCloseDayTimeGap() {
            return this.closeDayTimeGap;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @k
        public final AttributedText getDetails() {
            return this.details;
        }

        @l
        public final SbStatusBlock.Event getEvent() {
            return this.event;
        }

        @k
        public final String getStatus() {
            return this.status;
        }

        @k
        public final SbReminderStyle getStyle() {
            return this.style;
        }

        @k
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.status);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.description);
            this.style.writeToParcel(parcel, flags);
            this.action.writeToParcel(parcel, flags);
            parcel.writeParcelable(this.details, flags);
            SbStatusBlock.Event event = this.event;
            if (event == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                event.writeToParcel(parcel, flags);
            }
            this.bannerType.writeToParcel(parcel, flags);
            Long l12 = this.closeDayTimeGap;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Shop;", "Landroid/os/Parcelable;", "", "id", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Shop implements Parcelable {

        @k
        public static final Parcelable.Creator<Shop> CREATOR = new Creator();

        @c("id")
        @k
        private final String id;

        @c("name")
        @l
        private final String name;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Shop> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Shop createFromParcel(@k Parcel parcel) {
                return new Shop(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Shop[] newArray(int i12) {
                return new Shop[i12];
            }
        }

        public Shop(@k String str, @l String str2) {
            this.id = str;
            this.name = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.name);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001:\u000501234BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b\t\u0010&R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b\n\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$Views;", "views", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$Favorites;", "favorites", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "isProSeller", "isSTR", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$Contacts;", "contacts", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$StatsMetrics;", "metrics", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$Views;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$Favorites;Lcom/avito/android/deep_linking/links/DeepLink;ZZLcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$Contacts;Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$StatsMetrics;Lcom/avito/android/remote/model/text/AttributedText;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$Views;", "getViews", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$Views;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$Favorites;", "getFavorites", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$Favorites;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Z", "()Z", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$Contacts;", "getContacts", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$Contacts;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$StatsMetrics;", "getMetrics", "()Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$StatsMetrics;", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Contacts", "Favorites", "StatsMetricItem", "StatsMetrics", "Views", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Stats implements Parcelable {

        @k
        public static final Parcelable.Creator<Stats> CREATOR = new Creator();

        @c("contacts")
        @l
        private final Contacts contacts;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c("favorites")
        @l
        private final Favorites favorites;

        @c("isProSeller")
        private final boolean isProSeller;

        @c("isSTR")
        private final boolean isSTR;

        @c("metrics")
        @l
        private final StatsMetrics metrics;

        @c("title")
        @l
        private final AttributedText title;

        @c("views")
        @k
        private final Views views;

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$Contacts;", "Landroid/os/Parcelable;", "", "total", "today", "<init>", "(II)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getTotal", "getToday", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Contacts implements Parcelable {

            @k
            public static final Parcelable.Creator<Contacts> CREATOR = new Creator();

            @c("today")
            private final int today;

            @c("total")
            private final int total;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Contacts> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Contacts createFromParcel(@k Parcel parcel) {
                    return new Contacts(parcel.readInt(), parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Contacts[] newArray(int i12) {
                    return new Contacts[i12];
                }
            }

            public Contacts(int i12, int i13) {
                this.total = i12;
                this.today = i13;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final int getToday() {
                return this.today;
            }

            public final int getTotal() {
                return this.total;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(this.total);
                parcel.writeInt(this.today);
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Stats> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Stats createFromParcel(@k Parcel parcel) {
                return new Stats(Views.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Favorites.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(Stats.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Contacts.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StatsMetrics.CREATOR.createFromParcel(parcel) : null, (AttributedText) parcel.readParcelable(Stats.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Stats[] newArray(int i12) {
                return new Stats[i12];
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$Favorites;", "Landroid/os/Parcelable;", "", "total", "<init>", "(I)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getTotal", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Favorites implements Parcelable {

            @k
            public static final Parcelable.Creator<Favorites> CREATOR = new Creator();

            @c("total")
            private final int total;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Favorites> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Favorites createFromParcel(@k Parcel parcel) {
                    return new Favorites(parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Favorites[] newArray(int i12) {
                    return new Favorites[i12];
                }
            }

            public Favorites(int i12) {
                this.total = i12;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final int getTotal() {
                return this.total;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(this.total);
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$StatsMetricItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "value", "relativeValue", "", "slug", "", "total", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/deep_linking/links/DeepLink;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getValue", "getRelativeValue", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getTotal", "()Ljava/lang/Integer;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class StatsMetricItem implements Parcelable {

            @k
            public static final Parcelable.Creator<StatsMetricItem> CREATOR = new Creator();

            @c("relativeValue")
            @l
            private final AttributedText relativeValue;

            @c("slug")
            @l
            private final String slug;

            @c("title")
            @l
            private final AttributedText title;

            @c("total")
            @l
            private final Integer total;

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @l
            private final DeepLink uri;

            @c("value")
            @l
            private final AttributedText value;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<StatsMetricItem> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final StatsMetricItem createFromParcel(@k Parcel parcel) {
                    return new StatsMetricItem((AttributedText) parcel.readParcelable(StatsMetricItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(StatsMetricItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(StatsMetricItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (DeepLink) parcel.readParcelable(StatsMetricItem.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final StatsMetricItem[] newArray(int i12) {
                    return new StatsMetricItem[i12];
                }
            }

            public StatsMetricItem(@l AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, @l String str, @l Integer num, @l DeepLink deepLink) {
                this.title = attributedText;
                this.value = attributedText2;
                this.relativeValue = attributedText3;
                this.slug = str;
                this.total = num;
                this.uri = deepLink;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final AttributedText getRelativeValue() {
                return this.relativeValue;
            }

            @l
            public final String getSlug() {
                return this.slug;
            }

            @l
            public final AttributedText getTitle() {
                return this.title;
            }

            @l
            public final Integer getTotal() {
                return this.total;
            }

            @l
            public final DeepLink getUri() {
                return this.uri;
            }

            @l
            public final AttributedText getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.title, flags);
                parcel.writeParcelable(this.value, flags);
                parcel.writeParcelable(this.relativeValue, flags);
                parcel.writeString(this.slug);
                Integer num = this.total;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num);
                }
                parcel.writeParcelable(this.uri, flags);
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$StatsMetrics;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$StatsMetricItem;", "items", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class StatsMetrics implements Parcelable {

            @k
            public static final Parcelable.Creator<StatsMetrics> CREATOR = new Creator();

            @c("items")
            @l
            private final List<StatsMetricItem> items;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<StatsMetrics> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final StatsMetrics createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i12);
                        int iC2 = 0;
                        while (iC2 != i12) {
                            iC2 = a.c(StatsMetricItem.CREATOR, parcel, arrayList2, iC2, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new StatsMetrics(arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final StatsMetrics[] newArray(int i12) {
                    return new StatsMetrics[i12];
                }
            }

            public StatsMetrics(@l List<StatsMetricItem> list) {
                this.items = list;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final List<StatsMetricItem> getItems() {
                return this.items;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                List<StatsMetricItem> list = this.items;
                if (list == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((StatsMetricItem) itA.next()).writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: MyAdvertDetails.kt */
        @d
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Stats$Views;", "Landroid/os/Parcelable;", "", "total", "today", "<init>", "(ILjava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getTotal", "Ljava/lang/Integer;", "getToday", "()Ljava/lang/Integer;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Views implements Parcelable {

            @k
            public static final Parcelable.Creator<Views> CREATOR = new Creator();

            @c("today")
            @l
            private final Integer today;

            @c("total")
            private final int total;

            /* compiled from: MyAdvertDetails.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Views> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Views createFromParcel(@k Parcel parcel) {
                    return new Views(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Views[] newArray(int i12) {
                    return new Views[i12];
                }
            }

            public Views(int i12, @l Integer num) {
                this.total = i12;
                this.today = num;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final Integer getToday() {
                return this.today;
            }

            public final int getTotal() {
                return this.total;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(this.total);
                Integer num = this.today;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num);
                }
            }
        }

        public Stats(@k Views views, @l Favorites favorites, @l DeepLink deepLink, boolean z12, boolean z13, @l Contacts contacts, @l StatsMetrics statsMetrics, @l AttributedText attributedText) {
            this.views = views;
            this.favorites = favorites;
            this.deepLink = deepLink;
            this.isProSeller = z12;
            this.isSTR = z13;
            this.contacts = contacts;
            this.metrics = statsMetrics;
            this.title = attributedText;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Contacts getContacts() {
            return this.contacts;
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final Favorites getFavorites() {
            return this.favorites;
        }

        @l
        public final StatsMetrics getMetrics() {
            return this.metrics;
        }

        @l
        public final AttributedText getTitle() {
            return this.title;
        }

        @k
        public final Views getViews() {
            return this.views;
        }

        /* renamed from: isProSeller, reason: from getter */
        public final boolean getIsProSeller() {
            return this.isProSeller;
        }

        /* renamed from: isSTR, reason: from getter */
        public final boolean getIsSTR() {
            return this.isSTR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.views.writeToParcel(parcel, flags);
            Favorites favorites = this.favorites;
            if (favorites == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                favorites.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.deepLink, flags);
            parcel.writeInt(this.isProSeller ? 1 : 0);
            parcel.writeInt(this.isSTR ? 1 : 0);
            Contacts contacts = this.contacts;
            if (contacts == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                contacts.writeToParcel(parcel, flags);
            }
            StatsMetrics statsMetrics = this.metrics;
            if (statsMetrics == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                statsMetrics.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.title, flags);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MyAdvertDetails.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Style;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SUCCESS", "NORMAL", "WARNING", "DANGER", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;

        @k
        private final String value;

        @c("success")
        public static final Style SUCCESS = new Style("SUCCESS", 0, "success");

        @c(Constants.NORMAL)
        public static final Style NORMAL = new Style("NORMAL", 1, Constants.NORMAL);

        @c(ConstraintKt.WARNING)
        public static final Style WARNING = new Style("WARNING", 2, ConstraintKt.WARNING);

        @c("danger")
        public static final Style DANGER = new Style("DANGER", 3, "danger");

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{SUCCESS, NORMAL, WARNING, DANGER};
        }

        static {
            Style[] styleArr$values = $values();
            $VALUES = styleArr$values;
            $ENTRIES = kotlin.enums.c.a(styleArr$values);
        }

        private Style(String str, int i12, String str2) {
            this.value = str2;
        }

        @k
        public static kotlin.enums.a<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        @k
        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SupportAutomation;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/adverts/MyAdvertDetails$SupportAutomation;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SupportAutomation implements Parcelable {

        @k
        public static final Parcelable.Creator<SupportAutomation> CREATOR = new Creator();

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SupportAutomation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SupportAutomation createFromParcel(@k Parcel parcel) {
                return new SupportAutomation(parcel.readString(), (DeepLink) parcel.readParcelable(SupportAutomation.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SupportAutomation[] newArray(int i12) {
                return new SupportAutomation[i12];
            }
        }

        public SupportAutomation(@k String str, @k DeepLink deepLink) {
            this.title = str;
            this.uri = deepLink;
        }

        public static /* synthetic */ SupportAutomation copy$default(SupportAutomation supportAutomation, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = supportAutomation.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = supportAutomation.uri;
            }
            return supportAutomation.copy(str, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }

        @k
        public final SupportAutomation copy(@k String title, @k DeepLink uri) {
            return new SupportAutomation(title, uri);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SupportAutomation)) {
                return false;
            }
            SupportAutomation supportAutomation = (SupportAutomation) other;
            return L.f(this.title, supportAutomation.title) && L.f(this.uri, supportAutomation.uri);
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final DeepLink getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SupportAutomation(title=");
            sb2.append(this.title);
            sb2.append(", uri=");
            return a.v(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.uri, flags);
        }
    }

    /* compiled from: MyAdvertDetails.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\u0004\u0018\u00010\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$Switcher;", "Landroid/os/Parcelable;", "id", "", "getId", "()Ljava/lang/String;", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "title", "getTitle", "value", "", "getValue", "()Ljava/lang/Boolean;", "setValue", "(Ljava/lang/Boolean;)V", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Switcher extends Parcelable {
        @k
        String getId();

        @l
        AttributedText getSubtitle();

        @k
        String getTitle();

        @l
        Boolean getValue();

        void setValue(@l Boolean bool);
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$VasBundlesBanner;", "Landroid/os/Parcelable;", "", "title", "", "closable", "", "dueDate", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "backgroundRippleColor", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Ljava/lang/String;ZLjava/lang/Long;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Z", "getClosable", "()Z", "Ljava/lang/Long;", "getDueDate", "()Ljava/lang/Long;", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundRippleColor", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VasBundlesBanner implements Parcelable {

        @k
        public static final Parcelable.Creator<VasBundlesBanner> CREATOR = new Creator();

        @c("backgroundColor")
        @l
        private final UniversalColor backgroundColor;

        @c("backgroundRippleColor")
        @l
        private final UniversalColor backgroundRippleColor;

        @c("closable")
        private final boolean closable;

        @c("dueDate")
        @l
        private final Long dueDate;

        @c("image")
        @l
        private final UniversalImage image;

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VasBundlesBanner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final VasBundlesBanner createFromParcel(@k Parcel parcel) {
                return new VasBundlesBanner(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (UniversalColor) parcel.readParcelable(VasBundlesBanner.class.getClassLoader()), (UniversalColor) parcel.readParcelable(VasBundlesBanner.class.getClassLoader()), (DeepLink) parcel.readParcelable(VasBundlesBanner.class.getClassLoader()), (UniversalImage) parcel.readParcelable(VasBundlesBanner.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final VasBundlesBanner[] newArray(int i12) {
                return new VasBundlesBanner[i12];
            }
        }

        public VasBundlesBanner(@k String str, boolean z12, @l Long l12, @l UniversalColor universalColor, @l UniversalColor universalColor2, @l DeepLink deepLink, @l UniversalImage universalImage) {
            this.title = str;
            this.closable = z12;
            this.dueDate = l12;
            this.backgroundColor = universalColor;
            this.backgroundRippleColor = universalColor2;
            this.uri = deepLink;
            this.image = universalImage;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        public final UniversalColor getBackgroundRippleColor() {
            return this.backgroundRippleColor;
        }

        public final boolean getClosable() {
            return this.closable;
        }

        @l
        public final Long getDueDate() {
            return this.dueDate;
        }

        @l
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeInt(this.closable ? 1 : 0);
            Long l12 = this.dueDate;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeParcelable(this.backgroundColor, flags);
            parcel.writeParcelable(this.backgroundRippleColor, flags);
            parcel.writeParcelable(this.uri, flags);
            parcel.writeParcelable(this.image, flags);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MyAdvertDetails.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$VerificationStatus;", "", "(Ljava/lang/String;I)V", "REQUEST_CADASTRAL_NUMBER", "REQUEST_PASSPORT", "VERIFICATION_IN_PROGRESS", "PASSPORT_VERIFICATION_ERROR", "OWNERSHIP_VERIFICATION_ERROR", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VerificationStatus {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ VerificationStatus[] $VALUES;

        @c("requestCadastralNumber")
        public static final VerificationStatus REQUEST_CADASTRAL_NUMBER = new VerificationStatus("REQUEST_CADASTRAL_NUMBER", 0);

        @c("requestPassport")
        public static final VerificationStatus REQUEST_PASSPORT = new VerificationStatus("REQUEST_PASSPORT", 1);

        @c("verificationInProgress")
        public static final VerificationStatus VERIFICATION_IN_PROGRESS = new VerificationStatus("VERIFICATION_IN_PROGRESS", 2);

        @c("passportVerificationError")
        public static final VerificationStatus PASSPORT_VERIFICATION_ERROR = new VerificationStatus("PASSPORT_VERIFICATION_ERROR", 3);

        @c("ownershipVerificationError")
        public static final VerificationStatus OWNERSHIP_VERIFICATION_ERROR = new VerificationStatus("OWNERSHIP_VERIFICATION_ERROR", 4);

        private static final /* synthetic */ VerificationStatus[] $values() {
            return new VerificationStatus[]{REQUEST_CADASTRAL_NUMBER, REQUEST_PASSPORT, VERIFICATION_IN_PROGRESS, PASSPORT_VERIFICATION_ERROR, OWNERSHIP_VERIFICATION_ERROR};
        }

        static {
            VerificationStatus[] verificationStatusArr$values = $values();
            $VALUES = verificationStatusArr$values;
            $ENTRIES = kotlin.enums.c.a(verificationStatusArr$values);
        }

        private VerificationStatus(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<VerificationStatus> getEntries() {
            return $ENTRIES;
        }

        public static VerificationStatus valueOf(String str) {
            return (VerificationStatus) Enum.valueOf(VerificationStatus.class, str);
        }

        public static VerificationStatus[] values() {
            return (VerificationStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MyAdvertDetails(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @k String str6, @l String str7, @l String str8, @l String str9, @l List<GeoReference> list, @k String str10, @k String str11, @l String str12, @l String str13, long j12, @l String str14, @l String str15, @l Coordinates coordinates, @l AdvertSharing advertSharing, @l List<Action> list2, @l String str16, @l String str17, @l BodyCondition bodyCondition, @l AnonymousNumber anonymousNumber, boolean z12, @k String str18, @l Seller seller, @l String str19, @l Boolean bool, @l MyAdvertVas myAdvertVas, @l Shop shop, @l VasBundlesBanner vasBundlesBanner, @l AlertBanner alertBanner, @l AuctionBanner auctionBanner, @l AdvertParameters advertParameters, @l List<ExtendedImage> list3, @l Video video, @l NativeVideo nativeVideo, @k String str20, @l Price price, @l Sales sales, @l StockManagement stockManagement, @l Stats stats, @l BeduinV2 beduinV2, @l String str21, @l List<RejectReason> list4, @l RejectReason rejectReason, @l EvidenceData evidenceData, @l String str22, @l ReservationInfo reservationInfo, @l ActivationInfo activationInfo, @l CompetitorAnalyticsInfo competitorAnalyticsInfo, @l AdvertSellerShortTermRent advertSellerShortTermRent, @l AppliedServicesInfo appliedServicesInfo, @l Verification verification, @l MyAdvertSafeDeal myAdvertSafeDeal, @l AdvertDetailsFeaturesTeasers advertDetailsFeaturesTeasers, @l List<ApartmentFeature> list5, @k AutoPublish autoPublish, @l CreditInfoItem creditInfoItem, @l SbStatusBlock sbStatusBlock, @l ServiceBookingReminderBlock serviceBookingReminderBlock, @l CarMarketPrice carMarketPrice, @l Boolean bool2, @l SalesContract salesContract, @l RealtyOwnerVerification realtyOwnerVerification, @l ReliableOwner reliableOwner, @l List<PromoBlockData> list6, @l InstallmentsPromoBlockData installmentsPromoBlockData, @l CheckInRules checkInRules, @l AdditionalSeller additionalSeller, @l FashionAuthenticity fashionAuthenticity, @l AdvertBadgeBar advertBadgeBar, @l ItemPromotion itemPromotion, @l BuyoutPhone buyoutPhone, @l List<? extends BeduinAction> list7, @l ItemReviews itemReviews, @l MyAdvertAutoSelect myAdvertAutoSelect, @l PremierPartner premierPartner, @l PublishWarningBanner publishWarningBanner, @l List<UxFeedbackConfigOld> list8, @l List<? extends DeepLink> list9, @l FillParametersBanner fillParametersBanner, @l DomotekaReportTeaser domotekaReportTeaser, @l MultiUrgencyBlockResponse multiUrgencyBlockResponse, @l DeepLink deepLink, @l MultiAddresses multiAddresses, @l List<? extends MultiItemParam> list10, @l MachineryRentalBanner machineryRentalBanner, @l DeliverySettings deliverySettings, @l PromoActivities promoActivities, @l EntryPointToAccountOwnerBanner entryPointToAccountOwnerBanner, @l AddedByAvitoParams addedByAvitoParams, @l DeepLink deepLink2, @l Portfolio portfolio, @l ServicesSellerSubscriptionBanner servicesSellerSubscriptionBanner, @l ContactsBbl contactsBbl, @l List<JobListItem> list11, @l SupportAutomation supportAutomation, @l CopyAdvertTooltip copyAdvertTooltip, @l BannerFromSxBanners bannerFromSxBanners) {
        this.id = str;
        this.locationName = str2;
        this.metroName = str3;
        this.districtName = str4;
        this.directionName = str5;
        this.categoryId = str6;
        this.locationId = str7;
        this.metroId = str8;
        this.address = str9;
        this.geoReferences = list;
        this.title = str10;
        this.toolbarTitle = str11;
        this.directionId = str12;
        this.districtId = str13;
        this.time = j12;
        this.ttlHumanized = str14;
        this.wizardId = str15;
        this.coordinates = coordinates;
        this.sharing = advertSharing;
        this.actions = list2;
        this.description = str16;
        this.descriptionHtml = str17;
        this.bodyCondition = bodyCondition;
        this.anonymousNumber = anonymousNumber;
        this.isDeliveryEnabled = z12;
        this.userType = str18;
        this.seller = seller;
        this.phone = str19;
        this.protection = bool;
        this.vas = myAdvertVas;
        this.shop = shop;
        this.vasBundlesBanner = vasBundlesBanner;
        this.alertBanner = alertBanner;
        this.auctionBanner = auctionBanner;
        this.parameters = advertParameters;
        this.images = list3;
        this.video = video;
        this.nativeVideo = nativeVideo;
        this.status = str20;
        this.price = price;
        this.sales = sales;
        this.stockManagement = stockManagement;
        this.stats = stats;
        this.statsBeduin = beduinV2;
        this.reasonsTitle = str21;
        this.reasons = list4;
        this.customReason = rejectReason;
        this.evidenceData = evidenceData;
        this.moderationInfo = str22;
        this.reservationInfo = reservationInfo;
        this.activationInfo = activationInfo;
        this.competitorAnalyticsInfo = competitorAnalyticsInfo;
        this.shortTermRent = advertSellerShortTermRent;
        this.appliedServices = appliedServicesInfo;
        this.verification = verification;
        this.safeDealServices = myAdvertSafeDeal;
        this.teasers = advertDetailsFeaturesTeasers;
        this.apartmentFeatures = list5;
        this.autoPublish = autoPublish;
        this.creditInfoItem = creditInfoItem;
        this.sbStatusBlock = sbStatusBlock;
        this.serviceBookingReminderBlock = serviceBookingReminderBlock;
        this.carMarketPrice = carMarketPrice;
        this.isIacChosen = bool2;
        this.salesContract = salesContract;
        this.realtyOwnerVerification = realtyOwnerVerification;
        this.reliableOwner = reliableOwner;
        this.promoBlockFeed = list6;
        this.installmentsPromoBlock = installmentsPromoBlockData;
        this.checkInRules = checkInRules;
        this.additionalSeller = additionalSeller;
        this.fashionAuthenticity = fashionAuthenticity;
        this.badgeBar = advertBadgeBar;
        this.itemPromotion = itemPromotion;
        this.buyoutPhone = buyoutPhone;
        this.verificationRecommendationActions = list7;
        this.itemReviews = itemReviews;
        this.autoSelect = myAdvertAutoSelect;
        this.premierPartner = premierPartner;
        this.publishWarningBanner = publishWarningBanner;
        this.uxFeedbackConfigs = list8;
        this.uxFeedbackDeepLinks = list9;
        this.fillParametersBanner = fillParametersBanner;
        this.domotekaReportTeaser = domotekaReportTeaser;
        this.multiUrgencyServicesBlock = multiUrgencyBlockResponse;
        this.autoDescriptionFeedback = deepLink;
        this.multiAddresses = multiAddresses;
        this.multiItemParams = list10;
        this.machineryRentalBanner = machineryRentalBanner;
        this.deliverySettings = deliverySettings;
        this.promoActivities = promoActivities;
        this.entryPointToAccountOwnerBanner = entryPointToAccountOwnerBanner;
        this.addedByAvitoParams = addedByAvitoParams;
        this.onAdvertLoadedDeepLink = deepLink2;
        this.portfolio = portfolio;
        this.servicesSellerSubscriptionBanner = servicesSellerSubscriptionBanner;
        this.contactsBbl = contactsBbl;
        this.jobListItems = list11;
        this.supportAutomation = supportAutomation;
        this.copyAdvertTooltip = copyAdvertTooltip;
        this.bannerFromSxBanners = bannerFromSxBanners;
    }

    @l
    public final List<Action> getActions() {
        return this.actions;
    }

    @l
    public final ActivationInfo getActivationInfo() {
        return this.activationInfo;
    }

    @l
    public final AddedByAvitoParams getAddedByAvitoParams() {
        return this.addedByAvitoParams;
    }

    @l
    public final AdditionalSeller getAdditionalSeller() {
        return this.additionalSeller;
    }

    @l
    public final String getAddress() {
        return this.address;
    }

    @l
    public final AlertBanner getAlertBanner() {
        return this.alertBanner;
    }

    @l
    public final AnonymousNumber getAnonymousNumber() {
        return this.anonymousNumber;
    }

    @l
    public final List<ApartmentFeature> getApartmentFeatures$_avito_discouraged_avito_api_user_advert() {
        return this.apartmentFeatures;
    }

    @l
    public final AppliedServicesInfo getAppliedServices() {
        return this.appliedServices;
    }

    @l
    public final AuctionBanner getAuctionBanner() {
        return this.auctionBanner;
    }

    @l
    public final DeepLink getAutoDescriptionFeedback() {
        return this.autoDescriptionFeedback;
    }

    @k
    public final AutoPublish getAutoPublish() {
        return this.autoPublish;
    }

    @l
    public final MyAdvertAutoSelect getAutoSelect() {
        return this.autoSelect;
    }

    @l
    public final AdvertBadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @l
    public final BannerFromSxBanners getBannerFromSxBanners() {
        return this.bannerFromSxBanners;
    }

    @l
    public final BodyCondition getBodyCondition() {
        return this.bodyCondition;
    }

    @l
    public final BuyoutPhone getBuyoutPhone() {
        return this.buyoutPhone;
    }

    @l
    public final CarMarketPrice getCarMarketPrice() {
        return this.carMarketPrice;
    }

    @k
    public final String getCategoryId() {
        return this.categoryId;
    }

    @l
    public final CheckInRules getCheckInRules() {
        return this.checkInRules;
    }

    @l
    public final CompetitorAnalyticsInfo getCompetitorAnalyticsInfo() {
        return this.competitorAnalyticsInfo;
    }

    @l
    public final ContactsBbl getContactsBbl() {
        return this.contactsBbl;
    }

    @l
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @l
    public final CopyAdvertTooltip getCopyAdvertTooltip() {
        return this.copyAdvertTooltip;
    }

    @l
    public final CreditInfoItem getCreditInfoItem() {
        return this.creditInfoItem;
    }

    @l
    public final RejectReason getCustomReason() {
        return this.customReason;
    }

    @l
    public final DeliverySettings getDeliverySettings() {
        return this.deliverySettings;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getDescriptionHtml() {
        return this.descriptionHtml;
    }

    @l
    public final String getDirectionId() {
        return this.directionId;
    }

    @l
    public final String getDirectionName() {
        return this.directionName;
    }

    @l
    public final String getDistrictId() {
        return this.districtId;
    }

    @l
    public final String getDistrictName() {
        return this.districtName;
    }

    @l
    public final DomotekaReportTeaser getDomotekaReportTeaser() {
        return this.domotekaReportTeaser;
    }

    @l
    public final EntryPointToAccountOwnerBanner getEntryPointToAccountOwnerBanner() {
        return this.entryPointToAccountOwnerBanner;
    }

    @l
    public final EvidenceData getEvidenceData() {
        return this.evidenceData;
    }

    @l
    public final FashionAuthenticity getFashionAuthenticity() {
        return this.fashionAuthenticity;
    }

    @l
    public final FillParametersBanner getFillParametersBanner() {
        return this.fillParametersBanner;
    }

    @l
    public final List<GeoReference> getGeoReferences() {
        return this.geoReferences;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final List<ExtendedImage> getImages() {
        return this.images;
    }

    @l
    public final InstallmentsPromoBlockData getInstallmentsPromoBlock() {
        return this.installmentsPromoBlock;
    }

    @l
    public final ItemPromotion getItemPromotion() {
        return this.itemPromotion;
    }

    @l
    public final ItemReviews getItemReviews() {
        return this.itemReviews;
    }

    @l
    public final List<JobListItem> getJobListItems() {
        return this.jobListItems;
    }

    @l
    public final String getLocationId() {
        return this.locationId;
    }

    @l
    public final String getLocationName() {
        return this.locationName;
    }

    @l
    public final MachineryRentalBanner getMachineryRentalBanner() {
        return this.machineryRentalBanner;
    }

    @l
    public final String getMetroId() {
        return this.metroId;
    }

    @l
    public final String getMetroName() {
        return this.metroName;
    }

    @l
    public final String getModerationInfo() {
        return this.moderationInfo;
    }

    @l
    public final MultiAddresses getMultiAddresses() {
        return this.multiAddresses;
    }

    @l
    public final List<MultiItemParam> getMultiItemParams() {
        return this.multiItemParams;
    }

    @l
    public final MultiUrgencyBlockResponse getMultiUrgencyServicesBlock() {
        return this.multiUrgencyServicesBlock;
    }

    @l
    public final NativeVideo getNativeVideo() {
        return this.nativeVideo;
    }

    @l
    public final DeepLink getOnAdvertLoadedDeepLink() {
        return this.onAdvertLoadedDeepLink;
    }

    @l
    public final AdvertParameters getParameters() {
        return this.parameters;
    }

    @l
    public final String getPhone() {
        return this.phone;
    }

    @l
    public final Portfolio getPortfolio() {
        return this.portfolio;
    }

    @l
    public final PremierPartner getPremierPartner() {
        return this.premierPartner;
    }

    @l
    public final Price getPrice() {
        return this.price;
    }

    @l
    public final PromoActivities getPromoActivities() {
        return this.promoActivities;
    }

    @l
    public final List<PromoBlockData> getPromoBlockFeed() {
        return this.promoBlockFeed;
    }

    @l
    public final Boolean getProtection() {
        return this.protection;
    }

    @l
    public final PublishWarningBanner getPublishWarningBanner() {
        return this.publishWarningBanner;
    }

    @l
    public final RealtyOwnerVerification getRealtyOwnerVerification() {
        return this.realtyOwnerVerification;
    }

    @l
    public final List<RejectReason> getReasons() {
        return this.reasons;
    }

    @l
    public final String getReasonsTitle() {
        return this.reasonsTitle;
    }

    @l
    public final ReliableOwner getReliableOwner() {
        return this.reliableOwner;
    }

    @l
    public final ReservationInfo getReservationInfo() {
        return this.reservationInfo;
    }

    @l
    public final MyAdvertSafeDeal getSafeDealServices() {
        return this.safeDealServices;
    }

    @l
    public final Sales getSales() {
        return this.sales;
    }

    @l
    public final SalesContract getSalesContract() {
        return this.salesContract;
    }

    @l
    public final SbStatusBlock getSbStatusBlock() {
        return this.sbStatusBlock;
    }

    @l
    public final Seller getSeller() {
        return this.seller;
    }

    @l
    public final ServiceBookingReminderBlock getServiceBookingReminderBlock() {
        return this.serviceBookingReminderBlock;
    }

    @l
    public final ServicesSellerSubscriptionBanner getServicesSellerSubscriptionBanner() {
        return this.servicesSellerSubscriptionBanner;
    }

    @l
    public final AdvertSharing getSharing() {
        return this.sharing;
    }

    @l
    public final Shop getShop() {
        return this.shop;
    }

    @l
    public final AdvertSellerShortTermRent getShortTermRent() {
        return this.shortTermRent;
    }

    @l
    public final Stats getStats() {
        return this.stats;
    }

    @l
    public final BeduinV2 getStatsBeduin() {
        return this.statsBeduin;
    }

    @k
    public final String getStatus() {
        return this.status;
    }

    @l
    public final StockManagement getStockManagement() {
        return this.stockManagement;
    }

    @l
    public final SupportAutomation getSupportAutomation() {
        return this.supportAutomation;
    }

    @l
    /* renamed from: getTeasers$_avito_discouraged_avito_api_user_advert, reason: from getter */
    public final AdvertDetailsFeaturesTeasers getTeasers() {
        return this.teasers;
    }

    public final long getTime() {
        return this.time;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    @l
    public final String getTtlHumanized() {
        return this.ttlHumanized;
    }

    @k
    public final String getUserType() {
        return this.userType;
    }

    @l
    public final List<UxFeedbackConfigOld> getUxFeedbackConfigs() {
        return this.uxFeedbackConfigs;
    }

    @l
    public final List<DeepLink> getUxFeedbackDeepLinks() {
        return this.uxFeedbackDeepLinks;
    }

    @l
    public final MyAdvertVas getVas() {
        return this.vas;
    }

    @l
    public final VasBundlesBanner getVasBundlesBanner() {
        return this.vasBundlesBanner;
    }

    @l
    public final Verification getVerification() {
        return this.verification;
    }

    @l
    public final List<BeduinAction> getVerificationRecommendationActions() {
        return this.verificationRecommendationActions;
    }

    @l
    public final Video getVideo() {
        return this.video;
    }

    @l
    public final String getWizardId() {
        return this.wizardId;
    }

    /* renamed from: isDeliveryEnabled, reason: from getter */
    public final boolean getIsDeliveryEnabled() {
        return this.isDeliveryEnabled;
    }

    @l
    /* renamed from: isIacChosen, reason: from getter */
    public final Boolean getIsIacChosen() {
        return this.isIacChosen;
    }

    /* compiled from: MyAdvertDetails.kt */
    @d
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails$ExtraAction;", "Landroid/os/Parcelable;", "", "localIcon", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLocalIcon", "()Ljava/lang/String;", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ExtraAction implements Parcelable {

        @k
        public static final Parcelable.Creator<ExtraAction> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c("localIcon")
        @k
        private final String localIcon;

        @c("text")
        @k
        private final String text;

        /* compiled from: MyAdvertDetails.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ExtraAction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ExtraAction createFromParcel(@k Parcel parcel) {
                return new ExtraAction(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ExtraAction.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ExtraAction[] newArray(int i12) {
                return new ExtraAction[i12];
            }
        }

        public ExtraAction(@k String str, @k String str2, @l DeepLink deepLink) {
            this.localIcon = str;
            this.text = str2;
            this.deepLink = deepLink;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final String getLocalIcon() {
            return this.localIcon;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.localIcon);
            parcel.writeString(this.text);
            parcel.writeParcelable(this.deepLink, flags);
        }

        public /* synthetic */ ExtraAction(String str, String str2, DeepLink deepLink, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : deepLink);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ MyAdvertDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, String str12, String str13, long j12, String str14, String str15, Coordinates coordinates, AdvertSharing advertSharing, List list2, String str16, String str17, BodyCondition bodyCondition, AnonymousNumber anonymousNumber, boolean z12, String str18, Seller seller, String str19, Boolean bool, MyAdvertVas myAdvertVas, Shop shop, VasBundlesBanner vasBundlesBanner, AlertBanner alertBanner, AuctionBanner auctionBanner, AdvertParameters advertParameters, List list3, Video video, NativeVideo nativeVideo, String str20, Price price, Sales sales, StockManagement stockManagement, Stats stats, BeduinV2 beduinV2, String str21, List list4, RejectReason rejectReason, EvidenceData evidenceData, String str22, ReservationInfo reservationInfo, ActivationInfo activationInfo, CompetitorAnalyticsInfo competitorAnalyticsInfo, AdvertSellerShortTermRent advertSellerShortTermRent, AppliedServicesInfo appliedServicesInfo, Verification verification, MyAdvertSafeDeal myAdvertSafeDeal, AdvertDetailsFeaturesTeasers advertDetailsFeaturesTeasers, List list5, AutoPublish autoPublish, CreditInfoItem creditInfoItem, SbStatusBlock sbStatusBlock, ServiceBookingReminderBlock serviceBookingReminderBlock, CarMarketPrice carMarketPrice, Boolean bool2, SalesContract salesContract, RealtyOwnerVerification realtyOwnerVerification, ReliableOwner reliableOwner, List list6, InstallmentsPromoBlockData installmentsPromoBlockData, CheckInRules checkInRules, AdditionalSeller additionalSeller, FashionAuthenticity fashionAuthenticity, AdvertBadgeBar advertBadgeBar, ItemPromotion itemPromotion, BuyoutPhone buyoutPhone, List list7, ItemReviews itemReviews, MyAdvertAutoSelect myAdvertAutoSelect, PremierPartner premierPartner, PublishWarningBanner publishWarningBanner, List list8, List list9, FillParametersBanner fillParametersBanner, DomotekaReportTeaser domotekaReportTeaser, MultiUrgencyBlockResponse multiUrgencyBlockResponse, DeepLink deepLink, MultiAddresses multiAddresses, List list10, MachineryRentalBanner machineryRentalBanner, DeliverySettings deliverySettings, PromoActivities promoActivities, EntryPointToAccountOwnerBanner entryPointToAccountOwnerBanner, AddedByAvitoParams addedByAvitoParams, DeepLink deepLink2, Portfolio portfolio, ServicesSellerSubscriptionBanner servicesSellerSubscriptionBanner, ContactsBbl contactsBbl, List list11, SupportAutomation supportAutomation, CopyAdvertTooltip copyAdvertTooltip, BannerFromSxBanners bannerFromSxBanners, int i12, int i13, int i14, int i15, C42822w c42822w) {
        AutoPublish autoPublish2;
        AutoPublishSwitcher autoPublishSwitcher = null;
        Object[] objArr = 0;
        ReservationInfo reservationInfo2 = (i13 & 131072) != 0 ? null : reservationInfo;
        Verification verification2 = (i13 & 4194304) != 0 ? null : verification;
        AdvertDetailsFeaturesTeasers advertDetailsFeaturesTeasers2 = (i13 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : advertDetailsFeaturesTeasers;
        List list12 = (i13 & 33554432) != 0 ? null : list5;
        if ((i13 & 67108864) != 0) {
            autoPublish2 = new AutoPublish(autoPublishSwitcher, 1, objArr == true ? 1 : 0);
        } else {
            autoPublish2 = autoPublish;
        }
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, list, str10, str11, str12, str13, j12, str14, str15, coordinates, advertSharing, list2, str16, str17, bodyCondition, anonymousNumber, z12, str18, seller, str19, bool, myAdvertVas, shop, vasBundlesBanner, alertBanner, auctionBanner, advertParameters, list3, video, nativeVideo, str20, price, sales, stockManagement, stats, beduinV2, str21, list4, rejectReason, evidenceData, str22, reservationInfo2, activationInfo, competitorAnalyticsInfo, advertSellerShortTermRent, appliedServicesInfo, verification2, myAdvertSafeDeal, advertDetailsFeaturesTeasers2, list12, autoPublish2, (i13 & 134217728) != 0 ? null : creditInfoItem, (i13 & 268435456) != 0 ? null : sbStatusBlock, (i13 & 536870912) != 0 ? null : serviceBookingReminderBlock, (i13 & 1073741824) != 0 ? null : carMarketPrice, (i13 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : bool2, (i14 & 1) != 0 ? null : salesContract, (i14 & 2) != 0 ? null : realtyOwnerVerification, (i14 & 4) != 0 ? null : reliableOwner, (i14 & 8) != 0 ? null : list6, (i14 & 16) != 0 ? null : installmentsPromoBlockData, (i14 & 32) != 0 ? null : checkInRules, (i14 & 64) != 0 ? null : additionalSeller, (i14 & 128) != 0 ? null : fashionAuthenticity, (i14 & 256) != 0 ? null : advertBadgeBar, (i14 & 512) != 0 ? null : itemPromotion, (i14 & 1024) != 0 ? null : buyoutPhone, (i14 & 2048) != 0 ? null : list7, (i14 & 4096) != 0 ? null : itemReviews, (i14 & 8192) != 0 ? null : myAdvertAutoSelect, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : premierPartner, (32768 & i14) != 0 ? null : publishWarningBanner, (65536 & i14) != 0 ? null : list8, (131072 & i14) != 0 ? null : list9, (262144 & i14) != 0 ? null : fillParametersBanner, (524288 & i14) != 0 ? null : domotekaReportTeaser, (1048576 & i14) != 0 ? null : multiUrgencyBlockResponse, (2097152 & i14) != 0 ? null : deepLink, (i14 & 4194304) != 0 ? null : multiAddresses, (8388608 & i14) != 0 ? null : list10, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : machineryRentalBanner, (i14 & 33554432) != 0 ? null : deliverySettings, (i14 & 67108864) != 0 ? null : promoActivities, (i14 & 134217728) != 0 ? null : entryPointToAccountOwnerBanner, (i14 & 268435456) != 0 ? null : addedByAvitoParams, (i14 & 536870912) != 0 ? null : deepLink2, (i14 & 1073741824) != 0 ? null : portfolio, (i14 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : servicesSellerSubscriptionBanner, (i15 & 1) != 0 ? null : contactsBbl, (i15 & 2) != 0 ? null : list11, (i15 & 4) != 0 ? null : supportAutomation, (i15 & 8) != 0 ? null : copyAdvertTooltip, (i15 & 16) != 0 ? null : bannerFromSxBanners);
    }
}
