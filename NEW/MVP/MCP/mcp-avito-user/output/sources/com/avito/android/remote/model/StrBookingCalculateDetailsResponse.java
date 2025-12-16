package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.travel_bnpl_calculator.model.PaymentTypeDetails;
import com.avito.android.travel_bnpl_calculator.model.PaymentTypes;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalculateDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001Bñ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b<\u00109J\u0012\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bC\u00109J\u0010\u0010D\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bR\u0010GJ\u0012\u0010S\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010.HÆ\u0003¢\u0006\u0004\b[\u0010\\Jª\u0002\u0010]\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.HÆ\u0001¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b_\u0010GJ\u0010\u0010a\u001a\u00020`HÖ\u0001¢\u0006\u0004\ba\u0010bJ\u001a\u0010f\u001a\u00020e2\b\u0010d\u001a\u0004\u0018\u00010cHÖ\u0003¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020`HÖ\u0001¢\u0006\u0004\bh\u0010bJ \u0010m\u001a\u00020l2\u0006\u0010j\u001a\u00020i2\u0006\u0010k\u001a\u00020`HÖ\u0001¢\u0006\u0004\bm\u0010nJ\u0018\u0010o\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÂ\u0003¢\u0006\u0004\bo\u0010pR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010q\u001a\u0004\br\u00103R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010s\u001a\u0004\bt\u00105R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010u\u001a\u0004\bv\u00107R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010w\u001a\u0004\bx\u00109R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010y\u001a\u0004\bz\u0010;R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010w\u001a\u0004\b{\u00109R\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010|R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010}\u001a\u0004\b~\u0010>R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0013\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010@R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0015\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010BR\u001d\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0016\u0010w\u001a\u0005\b\u0083\u0001\u00109R\u001c\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010ER\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010GR\u001c\u0010\u001c\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010IR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010KR\u001e\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b \u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010MR\u001e\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\"\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010OR\u001e\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b$\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010QR\u001e\u0010%\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b%\u0010\u0086\u0001\u001a\u0005\b\u0092\u0001\u0010GR\u001e\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b'\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010TR\u001e\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010\u0095\u0001\u001a\u0005\b\u0096\u0001\u0010VR\u001e\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b+\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010XR\u001e\u0010-\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b-\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010ZR\u001e\u0010/\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b/\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010\\R\u0019\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010p¨\u0006\u009f\u0001"}, d2 = {"Lcom/avito/android/remote/model/StrBookingCalculateDetailsResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/ItemShortcut;", "itemShortcut", "Lcom/avito/android/remote/model/AccommodationDetails;", "accommodationDetails", "Lcom/avito/android/remote/model/RulesInfo;", "rulesInfo", "Lcom/avito/android/remote/model/text/AttributedText;", "landlordCommunication", "Lcom/avito/android/remote/model/ContactInfo;", "contactInfo", "calculationsInfo", "", "Lcom/avito/android/remote/model/StrBookingCalculation;", "_calculations", "Lcom/avito/android/remote/model/StrBookingCalculationOptions;", "calculationOptions", "Lcom/avito/android/remote/model/StrBookingPromoCodeInfo;", "promoCodeInfo", "Lcom/avito/android/remote/model/StrBookingDisclaimer;", ServiceTransportationWidget.DisclaimerField.TYPE, "footer", "Lcom/avito/android/remote/model/NextAction;", "action", "", "screenTitle", "Lcom/avito/android/remote/model/StrBookingPromo;", "promo", "Lcom/avito/android/remote/model/Badges;", "badges", "Lcom/avito/android/remote/model/TrustItems;", "trustItems", "Lcom/avito/android/remote/model/RefundRules;", "refundRules", "Lcom/avito/android/remote/model/UxFeedback;", "uxFeedback", "idempotencyKey", "Lcom/avito/android/travel_bnpl_calculator/model/PaymentTypes;", "paymentTypes", "Lcom/avito/android/travel_bnpl_calculator/model/PaymentTypeDetails;", "paymentTypeDetails", "Lcom/avito/android/remote/model/RefundToggle;", "refundToggle", "", "mcid", "Lcom/avito/android/remote/model/LoaderInfoResponse;", "loaderInfo", "<init>", "(Lcom/avito/android/remote/model/ItemShortcut;Lcom/avito/android/remote/model/AccommodationDetails;Lcom/avito/android/remote/model/RulesInfo;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ContactInfo;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/StrBookingCalculationOptions;Lcom/avito/android/remote/model/StrBookingPromoCodeInfo;Lcom/avito/android/remote/model/StrBookingDisclaimer;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/NextAction;Ljava/lang/String;Lcom/avito/android/remote/model/StrBookingPromo;Lcom/avito/android/remote/model/Badges;Lcom/avito/android/remote/model/TrustItems;Lcom/avito/android/remote/model/RefundRules;Lcom/avito/android/remote/model/UxFeedback;Ljava/lang/String;Lcom/avito/android/travel_bnpl_calculator/model/PaymentTypes;Lcom/avito/android/travel_bnpl_calculator/model/PaymentTypeDetails;Lcom/avito/android/remote/model/RefundToggle;Ljava/lang/Long;Lcom/avito/android/remote/model/LoaderInfoResponse;)V", "component1", "()Lcom/avito/android/remote/model/ItemShortcut;", "component2", "()Lcom/avito/android/remote/model/AccommodationDetails;", "component3", "()Lcom/avito/android/remote/model/RulesInfo;", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "()Lcom/avito/android/remote/model/ContactInfo;", "component6", "component8", "()Lcom/avito/android/remote/model/StrBookingCalculationOptions;", "component9", "()Lcom/avito/android/remote/model/StrBookingPromoCodeInfo;", "component10", "()Lcom/avito/android/remote/model/StrBookingDisclaimer;", "component11", "component12", "()Lcom/avito/android/remote/model/NextAction;", "component13", "()Ljava/lang/String;", "component14", "()Lcom/avito/android/remote/model/StrBookingPromo;", "component15", "()Lcom/avito/android/remote/model/Badges;", "component16", "()Lcom/avito/android/remote/model/TrustItems;", "component17", "()Lcom/avito/android/remote/model/RefundRules;", "component18", "()Lcom/avito/android/remote/model/UxFeedback;", "component19", "component20", "()Lcom/avito/android/travel_bnpl_calculator/model/PaymentTypes;", "component21", "()Lcom/avito/android/travel_bnpl_calculator/model/PaymentTypeDetails;", "component22", "()Lcom/avito/android/remote/model/RefundToggle;", "component23", "()Ljava/lang/Long;", "component24", "()Lcom/avito/android/remote/model/LoaderInfoResponse;", "copy", "(Lcom/avito/android/remote/model/ItemShortcut;Lcom/avito/android/remote/model/AccommodationDetails;Lcom/avito/android/remote/model/RulesInfo;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ContactInfo;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/StrBookingCalculationOptions;Lcom/avito/android/remote/model/StrBookingPromoCodeInfo;Lcom/avito/android/remote/model/StrBookingDisclaimer;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/NextAction;Ljava/lang/String;Lcom/avito/android/remote/model/StrBookingPromo;Lcom/avito/android/remote/model/Badges;Lcom/avito/android/remote/model/TrustItems;Lcom/avito/android/remote/model/RefundRules;Lcom/avito/android/remote/model/UxFeedback;Ljava/lang/String;Lcom/avito/android/travel_bnpl_calculator/model/PaymentTypes;Lcom/avito/android/travel_bnpl_calculator/model/PaymentTypeDetails;Lcom/avito/android/remote/model/RefundToggle;Ljava/lang/Long;Lcom/avito/android/remote/model/LoaderInfoResponse;)Lcom/avito/android/remote/model/StrBookingCalculateDetailsResponse;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component7", "()Ljava/util/List;", "Lcom/avito/android/remote/model/ItemShortcut;", "getItemShortcut", "Lcom/avito/android/remote/model/AccommodationDetails;", "getAccommodationDetails", "Lcom/avito/android/remote/model/RulesInfo;", "getRulesInfo", "Lcom/avito/android/remote/model/text/AttributedText;", "getLandlordCommunication", "Lcom/avito/android/remote/model/ContactInfo;", "getContactInfo", "getCalculationsInfo", "Ljava/util/List;", "Lcom/avito/android/remote/model/StrBookingCalculationOptions;", "getCalculationOptions", "Lcom/avito/android/remote/model/StrBookingPromoCodeInfo;", "getPromoCodeInfo", "Lcom/avito/android/remote/model/StrBookingDisclaimer;", "getDisclaimer", "getFooter", "Lcom/avito/android/remote/model/NextAction;", "getAction", "Ljava/lang/String;", "getScreenTitle", "Lcom/avito/android/remote/model/StrBookingPromo;", "getPromo", "Lcom/avito/android/remote/model/Badges;", "getBadges", "Lcom/avito/android/remote/model/TrustItems;", "getTrustItems", "Lcom/avito/android/remote/model/RefundRules;", "getRefundRules", "Lcom/avito/android/remote/model/UxFeedback;", "getUxFeedback", "getIdempotencyKey", "Lcom/avito/android/travel_bnpl_calculator/model/PaymentTypes;", "getPaymentTypes", "Lcom/avito/android/travel_bnpl_calculator/model/PaymentTypeDetails;", "getPaymentTypeDetails", "Lcom/avito/android/remote/model/RefundToggle;", "getRefundToggle", "Ljava/lang/Long;", "getMcid", "Lcom/avito/android/remote/model/LoaderInfoResponse;", "getLoaderInfo", "getCalculations", "calculations", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrBookingCalculateDetailsResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<StrBookingCalculateDetailsResponse> CREATOR = new Creator();

    @c("calculations")
    @l
    private final List<StrBookingCalculation> _calculations;

    @c("accommodationDetails")
    @k
    private final AccommodationDetails accommodationDetails;

    @c("action")
    @k
    private final NextAction action;

    @c("badges")
    @l
    private final Badges badges;

    @c("calculationOptions")
    @l
    private final StrBookingCalculationOptions calculationOptions;

    @c("calculationsInfo")
    @l
    private final AttributedText calculationsInfo;

    @c("contactInfo")
    @k
    private final ContactInfo contactInfo;

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @l
    private final StrBookingDisclaimer disclaimer;

    @c("footer")
    @l
    private final AttributedText footer;

    @c("idempotencyKey")
    @l
    private final String idempotencyKey;

    @c("itemShortcut")
    @k
    private final ItemShortcut itemShortcut;

    @c("landlordCommunication")
    @k
    private final AttributedText landlordCommunication;

    @c("loaderInfo")
    @l
    private final LoaderInfoResponse loaderInfo;

    @c("mcid")
    @l
    private final Long mcid;

    @c("paymentTypeDetails")
    @l
    private final PaymentTypeDetails paymentTypeDetails;

    @c("paymentTypes")
    @l
    private final PaymentTypes paymentTypes;

    @c("promo")
    @k
    private final StrBookingPromo promo;

    @c("promoCodeInfo")
    @l
    private final StrBookingPromoCodeInfo promoCodeInfo;

    @c("refundRules")
    @l
    private final RefundRules refundRules;

    @c("refundToggle")
    @l
    private final RefundToggle refundToggle;

    @c("rulesInfo")
    @l
    private final RulesInfo rulesInfo;

    @c("screenTitle")
    @l
    private final String screenTitle;

    @c("trustItems")
    @l
    private final TrustItems trustItems;

    @c("uxFeedback")
    @l
    private final UxFeedback uxFeedback;

    /* compiled from: StrBookingCalculateDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrBookingCalculateDetailsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrBookingCalculateDetailsResponse createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ItemShortcut itemShortcutCreateFromParcel = ItemShortcut.CREATOR.createFromParcel(parcel);
            AccommodationDetails accommodationDetailsCreateFromParcel = AccommodationDetails.CREATOR.createFromParcel(parcel);
            RulesInfo rulesInfoCreateFromParcel = parcel.readInt() == 0 ? null : RulesInfo.CREATOR.createFromParcel(parcel);
            AttributedText attributedText = (AttributedText) parcel.readParcelable(StrBookingCalculateDetailsResponse.class.getClassLoader());
            ContactInfo contactInfoCreateFromParcel = ContactInfo.CREATOR.createFromParcel(parcel);
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(StrBookingCalculateDetailsResponse.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(StrBookingCalculation.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new StrBookingCalculateDetailsResponse(itemShortcutCreateFromParcel, accommodationDetailsCreateFromParcel, rulesInfoCreateFromParcel, attributedText, contactInfoCreateFromParcel, attributedText2, arrayList, parcel.readInt() == 0 ? null : StrBookingCalculationOptions.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StrBookingPromoCodeInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StrBookingDisclaimer.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(StrBookingCalculateDetailsResponse.class.getClassLoader()), NextAction.CREATOR.createFromParcel(parcel), parcel.readString(), StrBookingPromo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Badges.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TrustItems.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RefundRules.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UxFeedback.CREATOR.createFromParcel(parcel), parcel.readString(), (PaymentTypes) parcel.readParcelable(StrBookingCalculateDetailsResponse.class.getClassLoader()), (PaymentTypeDetails) parcel.readParcelable(StrBookingCalculateDetailsResponse.class.getClassLoader()), parcel.readInt() == 0 ? null : RefundToggle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : LoaderInfoResponse.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrBookingCalculateDetailsResponse[] newArray(int i12) {
            return new StrBookingCalculateDetailsResponse[i12];
        }
    }

    public StrBookingCalculateDetailsResponse(@k ItemShortcut itemShortcut, @k AccommodationDetails accommodationDetails, @l RulesInfo rulesInfo, @k AttributedText attributedText, @k ContactInfo contactInfo, @l AttributedText attributedText2, @l List<StrBookingCalculation> list, @l StrBookingCalculationOptions strBookingCalculationOptions, @l StrBookingPromoCodeInfo strBookingPromoCodeInfo, @l StrBookingDisclaimer strBookingDisclaimer, @l AttributedText attributedText3, @k NextAction nextAction, @l String str, @k StrBookingPromo strBookingPromo, @l Badges badges, @l TrustItems trustItems, @l RefundRules refundRules, @l UxFeedback uxFeedback, @l String str2, @l PaymentTypes paymentTypes, @l PaymentTypeDetails paymentTypeDetails, @l RefundToggle refundToggle, @l Long l12, @l LoaderInfoResponse loaderInfoResponse) {
        this.itemShortcut = itemShortcut;
        this.accommodationDetails = accommodationDetails;
        this.rulesInfo = rulesInfo;
        this.landlordCommunication = attributedText;
        this.contactInfo = contactInfo;
        this.calculationsInfo = attributedText2;
        this._calculations = list;
        this.calculationOptions = strBookingCalculationOptions;
        this.promoCodeInfo = strBookingPromoCodeInfo;
        this.disclaimer = strBookingDisclaimer;
        this.footer = attributedText3;
        this.action = nextAction;
        this.screenTitle = str;
        this.promo = strBookingPromo;
        this.badges = badges;
        this.trustItems = trustItems;
        this.refundRules = refundRules;
        this.uxFeedback = uxFeedback;
        this.idempotencyKey = str2;
        this.paymentTypes = paymentTypes;
        this.paymentTypeDetails = paymentTypeDetails;
        this.refundToggle = refundToggle;
        this.mcid = l12;
        this.loaderInfo = loaderInfoResponse;
    }

    private final List<StrBookingCalculation> component7() {
        return this._calculations;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final ItemShortcut getItemShortcut() {
        return this.itemShortcut;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final StrBookingDisclaimer getDisclaimer() {
        return this.disclaimer;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final AttributedText getFooter() {
        return this.footer;
    }

    @k
    /* renamed from: component12, reason: from getter */
    public final NextAction getAction() {
        return this.action;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final String getScreenTitle() {
        return this.screenTitle;
    }

    @k
    /* renamed from: component14, reason: from getter */
    public final StrBookingPromo getPromo() {
        return this.promo;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final Badges getBadges() {
        return this.badges;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final TrustItems getTrustItems() {
        return this.trustItems;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final RefundRules getRefundRules() {
        return this.refundRules;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final UxFeedback getUxFeedback() {
        return this.uxFeedback;
    }

    @l
    /* renamed from: component19, reason: from getter */
    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AccommodationDetails getAccommodationDetails() {
        return this.accommodationDetails;
    }

    @l
    /* renamed from: component20, reason: from getter */
    public final PaymentTypes getPaymentTypes() {
        return this.paymentTypes;
    }

    @l
    /* renamed from: component21, reason: from getter */
    public final PaymentTypeDetails getPaymentTypeDetails() {
        return this.paymentTypeDetails;
    }

    @l
    /* renamed from: component22, reason: from getter */
    public final RefundToggle getRefundToggle() {
        return this.refundToggle;
    }

    @l
    /* renamed from: component23, reason: from getter */
    public final Long getMcid() {
        return this.mcid;
    }

    @l
    /* renamed from: component24, reason: from getter */
    public final LoaderInfoResponse getLoaderInfo() {
        return this.loaderInfo;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final RulesInfo getRulesInfo() {
        return this.rulesInfo;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final AttributedText getLandlordCommunication() {
        return this.landlordCommunication;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final ContactInfo getContactInfo() {
        return this.contactInfo;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AttributedText getCalculationsInfo() {
        return this.calculationsInfo;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final StrBookingCalculationOptions getCalculationOptions() {
        return this.calculationOptions;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final StrBookingPromoCodeInfo getPromoCodeInfo() {
        return this.promoCodeInfo;
    }

    @k
    public final StrBookingCalculateDetailsResponse copy(@k ItemShortcut itemShortcut, @k AccommodationDetails accommodationDetails, @l RulesInfo rulesInfo, @k AttributedText landlordCommunication, @k ContactInfo contactInfo, @l AttributedText calculationsInfo, @l List<StrBookingCalculation> _calculations, @l StrBookingCalculationOptions calculationOptions, @l StrBookingPromoCodeInfo promoCodeInfo, @l StrBookingDisclaimer disclaimer, @l AttributedText footer, @k NextAction action, @l String screenTitle, @k StrBookingPromo promo, @l Badges badges, @l TrustItems trustItems, @l RefundRules refundRules, @l UxFeedback uxFeedback, @l String idempotencyKey, @l PaymentTypes paymentTypes, @l PaymentTypeDetails paymentTypeDetails, @l RefundToggle refundToggle, @l Long mcid, @l LoaderInfoResponse loaderInfo) {
        return new StrBookingCalculateDetailsResponse(itemShortcut, accommodationDetails, rulesInfo, landlordCommunication, contactInfo, calculationsInfo, _calculations, calculationOptions, promoCodeInfo, disclaimer, footer, action, screenTitle, promo, badges, trustItems, refundRules, uxFeedback, idempotencyKey, paymentTypes, paymentTypeDetails, refundToggle, mcid, loaderInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrBookingCalculateDetailsResponse)) {
            return false;
        }
        StrBookingCalculateDetailsResponse strBookingCalculateDetailsResponse = (StrBookingCalculateDetailsResponse) other;
        return L.f(this.itemShortcut, strBookingCalculateDetailsResponse.itemShortcut) && L.f(this.accommodationDetails, strBookingCalculateDetailsResponse.accommodationDetails) && L.f(this.rulesInfo, strBookingCalculateDetailsResponse.rulesInfo) && L.f(this.landlordCommunication, strBookingCalculateDetailsResponse.landlordCommunication) && L.f(this.contactInfo, strBookingCalculateDetailsResponse.contactInfo) && L.f(this.calculationsInfo, strBookingCalculateDetailsResponse.calculationsInfo) && L.f(this._calculations, strBookingCalculateDetailsResponse._calculations) && L.f(this.calculationOptions, strBookingCalculateDetailsResponse.calculationOptions) && L.f(this.promoCodeInfo, strBookingCalculateDetailsResponse.promoCodeInfo) && L.f(this.disclaimer, strBookingCalculateDetailsResponse.disclaimer) && L.f(this.footer, strBookingCalculateDetailsResponse.footer) && L.f(this.action, strBookingCalculateDetailsResponse.action) && L.f(this.screenTitle, strBookingCalculateDetailsResponse.screenTitle) && L.f(this.promo, strBookingCalculateDetailsResponse.promo) && L.f(this.badges, strBookingCalculateDetailsResponse.badges) && L.f(this.trustItems, strBookingCalculateDetailsResponse.trustItems) && L.f(this.refundRules, strBookingCalculateDetailsResponse.refundRules) && L.f(this.uxFeedback, strBookingCalculateDetailsResponse.uxFeedback) && L.f(this.idempotencyKey, strBookingCalculateDetailsResponse.idempotencyKey) && L.f(this.paymentTypes, strBookingCalculateDetailsResponse.paymentTypes) && L.f(this.paymentTypeDetails, strBookingCalculateDetailsResponse.paymentTypeDetails) && L.f(this.refundToggle, strBookingCalculateDetailsResponse.refundToggle) && L.f(this.mcid, strBookingCalculateDetailsResponse.mcid) && L.f(this.loaderInfo, strBookingCalculateDetailsResponse.loaderInfo);
    }

    @k
    public final AccommodationDetails getAccommodationDetails() {
        return this.accommodationDetails;
    }

    @k
    public final NextAction getAction() {
        return this.action;
    }

    @l
    public final Badges getBadges() {
        return this.badges;
    }

    @l
    public final StrBookingCalculationOptions getCalculationOptions() {
        return this.calculationOptions;
    }

    @k
    public final List<StrBookingCalculation> getCalculations() {
        List<StrBookingCalculation> list = this._calculations;
        return list == null ? C42784z0.f406748b : list;
    }

    @l
    public final AttributedText getCalculationsInfo() {
        return this.calculationsInfo;
    }

    @k
    public final ContactInfo getContactInfo() {
        return this.contactInfo;
    }

    @l
    public final StrBookingDisclaimer getDisclaimer() {
        return this.disclaimer;
    }

    @l
    public final AttributedText getFooter() {
        return this.footer;
    }

    @l
    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    @k
    public final ItemShortcut getItemShortcut() {
        return this.itemShortcut;
    }

    @k
    public final AttributedText getLandlordCommunication() {
        return this.landlordCommunication;
    }

    @l
    public final LoaderInfoResponse getLoaderInfo() {
        return this.loaderInfo;
    }

    @l
    public final Long getMcid() {
        return this.mcid;
    }

    @l
    public final PaymentTypeDetails getPaymentTypeDetails() {
        return this.paymentTypeDetails;
    }

    @l
    public final PaymentTypes getPaymentTypes() {
        return this.paymentTypes;
    }

    @k
    public final StrBookingPromo getPromo() {
        return this.promo;
    }

    @l
    public final StrBookingPromoCodeInfo getPromoCodeInfo() {
        return this.promoCodeInfo;
    }

    @l
    public final RefundRules getRefundRules() {
        return this.refundRules;
    }

    @l
    public final RefundToggle getRefundToggle() {
        return this.refundToggle;
    }

    @l
    public final RulesInfo getRulesInfo() {
        return this.rulesInfo;
    }

    @l
    public final String getScreenTitle() {
        return this.screenTitle;
    }

    @l
    public final TrustItems getTrustItems() {
        return this.trustItems;
    }

    @l
    public final UxFeedback getUxFeedback() {
        return this.uxFeedback;
    }

    public int hashCode() {
        int iHashCode = (this.accommodationDetails.hashCode() + (this.itemShortcut.hashCode() * 31)) * 31;
        RulesInfo rulesInfo = this.rulesInfo;
        int iHashCode2 = (this.contactInfo.hashCode() + a.b((iHashCode + (rulesInfo == null ? 0 : rulesInfo.hashCode())) * 31, 31, this.landlordCommunication)) * 31;
        AttributedText attributedText = this.calculationsInfo;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        List<StrBookingCalculation> list = this._calculations;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        StrBookingCalculationOptions strBookingCalculationOptions = this.calculationOptions;
        int iHashCode5 = (iHashCode4 + (strBookingCalculationOptions == null ? 0 : strBookingCalculationOptions.hashCode())) * 31;
        StrBookingPromoCodeInfo strBookingPromoCodeInfo = this.promoCodeInfo;
        int iHashCode6 = (iHashCode5 + (strBookingPromoCodeInfo == null ? 0 : strBookingPromoCodeInfo.hashCode())) * 31;
        StrBookingDisclaimer strBookingDisclaimer = this.disclaimer;
        int iHashCode7 = (iHashCode6 + (strBookingDisclaimer == null ? 0 : strBookingDisclaimer.hashCode())) * 31;
        AttributedText attributedText2 = this.footer;
        int iHashCode8 = (this.action.hashCode() + ((iHashCode7 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31)) * 31;
        String str = this.screenTitle;
        int iHashCode9 = (this.promo.hashCode() + ((iHashCode8 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Badges badges = this.badges;
        int iHashCode10 = (iHashCode9 + (badges == null ? 0 : badges.hashCode())) * 31;
        TrustItems trustItems = this.trustItems;
        int iHashCode11 = (iHashCode10 + (trustItems == null ? 0 : trustItems.hashCode())) * 31;
        RefundRules refundRules = this.refundRules;
        int iHashCode12 = (iHashCode11 + (refundRules == null ? 0 : refundRules.hashCode())) * 31;
        UxFeedback uxFeedback = this.uxFeedback;
        int iHashCode13 = (iHashCode12 + (uxFeedback == null ? 0 : uxFeedback.hashCode())) * 31;
        String str2 = this.idempotencyKey;
        int iHashCode14 = (iHashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PaymentTypes paymentTypes = this.paymentTypes;
        int iHashCode15 = (iHashCode14 + (paymentTypes == null ? 0 : paymentTypes.hashCode())) * 31;
        PaymentTypeDetails paymentTypeDetails = this.paymentTypeDetails;
        int iHashCode16 = (iHashCode15 + (paymentTypeDetails == null ? 0 : paymentTypeDetails.hashCode())) * 31;
        RefundToggle refundToggle = this.refundToggle;
        int iHashCode17 = (iHashCode16 + (refundToggle == null ? 0 : refundToggle.hashCode())) * 31;
        Long l12 = this.mcid;
        int iHashCode18 = (iHashCode17 + (l12 == null ? 0 : l12.hashCode())) * 31;
        LoaderInfoResponse loaderInfoResponse = this.loaderInfo;
        return iHashCode18 + (loaderInfoResponse != null ? loaderInfoResponse.hashCode() : 0);
    }

    @k
    public String toString() {
        return "StrBookingCalculateDetailsResponse(itemShortcut=" + this.itemShortcut + ", accommodationDetails=" + this.accommodationDetails + ", rulesInfo=" + this.rulesInfo + ", landlordCommunication=" + this.landlordCommunication + ", contactInfo=" + this.contactInfo + ", calculationsInfo=" + this.calculationsInfo + ", _calculations=" + this._calculations + ", calculationOptions=" + this.calculationOptions + ", promoCodeInfo=" + this.promoCodeInfo + ", disclaimer=" + this.disclaimer + ", footer=" + this.footer + ", action=" + this.action + ", screenTitle=" + this.screenTitle + ", promo=" + this.promo + ", badges=" + this.badges + ", trustItems=" + this.trustItems + ", refundRules=" + this.refundRules + ", uxFeedback=" + this.uxFeedback + ", idempotencyKey=" + this.idempotencyKey + ", paymentTypes=" + this.paymentTypes + ", paymentTypeDetails=" + this.paymentTypeDetails + ", refundToggle=" + this.refundToggle + ", mcid=" + this.mcid + ", loaderInfo=" + this.loaderInfo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.itemShortcut.writeToParcel(parcel, flags);
        this.accommodationDetails.writeToParcel(parcel, flags);
        RulesInfo rulesInfo = this.rulesInfo;
        if (rulesInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rulesInfo.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.landlordCommunication, flags);
        this.contactInfo.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.calculationsInfo, flags);
        List<StrBookingCalculation> list = this._calculations;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((StrBookingCalculation) itA.next()).writeToParcel(parcel, flags);
            }
        }
        StrBookingCalculationOptions strBookingCalculationOptions = this.calculationOptions;
        if (strBookingCalculationOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strBookingCalculationOptions.writeToParcel(parcel, flags);
        }
        StrBookingPromoCodeInfo strBookingPromoCodeInfo = this.promoCodeInfo;
        if (strBookingPromoCodeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strBookingPromoCodeInfo.writeToParcel(parcel, flags);
        }
        StrBookingDisclaimer strBookingDisclaimer = this.disclaimer;
        if (strBookingDisclaimer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strBookingDisclaimer.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.footer, flags);
        this.action.writeToParcel(parcel, flags);
        parcel.writeString(this.screenTitle);
        this.promo.writeToParcel(parcel, flags);
        Badges badges = this.badges;
        if (badges == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badges.writeToParcel(parcel, flags);
        }
        TrustItems trustItems = this.trustItems;
        if (trustItems == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trustItems.writeToParcel(parcel, flags);
        }
        RefundRules refundRules = this.refundRules;
        if (refundRules == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            refundRules.writeToParcel(parcel, flags);
        }
        UxFeedback uxFeedback = this.uxFeedback;
        if (uxFeedback == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uxFeedback.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.idempotencyKey);
        parcel.writeParcelable(this.paymentTypes, flags);
        parcel.writeParcelable(this.paymentTypeDetails, flags);
        RefundToggle refundToggle = this.refundToggle;
        if (refundToggle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            refundToggle.writeToParcel(parcel, flags);
        }
        Long l12 = this.mcid;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        LoaderInfoResponse loaderInfoResponse = this.loaderInfo;
        if (loaderInfoResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            loaderInfoResponse.writeToParcel(parcel, flags);
        }
    }
}
