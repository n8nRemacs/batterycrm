package com.avito.android.rating_form;

import com.avito.android.photo_list_view.N;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RatingFormFieldMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/i;", "", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f248138f = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final N f248139a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.links.w f248140b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.links.x f248141c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34199b f248142d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.custom_params.d f248143e;

    /* compiled from: RatingFormFieldMapper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/rating_form/i$a;", "", "<init>", "()V", "", "MAX_FILE_COUNT", "I", "MAX_IMAGE_COUNT", "SELECT_SEARCH_LIMIT", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingFormFieldMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f248144a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f248145b;

        static {
            int[] iArr = new int[RatingFormField.ViewType.values().length];
            try {
                iArr[RatingFormField.ViewType.CHECKBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RatingFormField.ViewType.RADIO_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RatingFormField.ViewType.SELECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RatingFormField.ViewType.ADDRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RatingFormField.ViewType.DEVELOPMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RatingFormField.ViewType.SCORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RatingFormField.ViewType.TEXTAREA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RatingFormField.ViewType.INPUT_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RatingFormField.ViewType.INPUT_TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[RatingFormField.ViewType.IMAGES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[RatingFormField.ViewType.ITEMS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[RatingFormField.ViewType.FILES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[RatingFormField.ViewType.CHIPS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f248144a = iArr;
            int[] iArr2 = new int[RatingFormField.ViewAction.values().length];
            try {
                iArr2[RatingFormField.ViewAction.PHOTO_PICKER_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            f248145b = iArr2;
        }
    }

    /* compiled from: RatingFormFieldMapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Value;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<RatingFormField.Value, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f248146l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(RatingFormField.Value value) {
            return value.getLabel();
        }
    }

    static {
        new a(null);
    }

    @Inject
    public i(@Y61.k N n12, @Y61.k com.avito.android.deep_linking.links.w wVar, @Y61.k com.avito.android.deep_linking.links.x xVar, @Y61.k InterfaceC34199b interfaceC34199b, @Y61.k com.avito.android.rating_form.custom_params.d dVar) {
        this.f248139a = n12;
        this.f248140b = wVar;
        this.f248141c = xVar;
        this.f248142d = interfaceC34199b;
        this.f248143e = dVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    public static ArrayList b(RatingFormField ratingFormField) {
        RatingFormField.ValueType value;
        ArrayList arrayList;
        List<RatingFormField.Value> listU = ratingFormField.u();
        if (listU == null || (value = ratingFormField.getValue()) == null) {
            return null;
        }
        if (value instanceof RatingFormField.ValueType.LongValue) {
            arrayList = new ArrayList();
            for (Object obj : listU) {
                if (L.f(((RatingFormField.Value) obj).getValue(), String.valueOf(((RatingFormField.ValueType.LongValue) value).f248001b))) {
                    arrayList.add(obj);
                }
            }
        } else if (value instanceof RatingFormField.ValueType.IntArrayValue) {
            arrayList = new ArrayList();
            for (Object obj2 : listU) {
                RatingFormField.Value value2 = (RatingFormField.Value) obj2;
                Iterable iterable = (Iterable) ((RatingFormField.ValueType.IntArrayValue) value).f247999b;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(String.valueOf(((Number) it.next()).intValue()));
                }
                if (arrayList2.contains(value2.getValue())) {
                    arrayList.add(obj2);
                }
            }
        } else if (value instanceof RatingFormField.ValueType.StringValue) {
            arrayList = new ArrayList();
            for (Object obj3 : listU) {
                if (L.f(((RatingFormField.Value) obj3).getValue(), ((RatingFormField.ValueType.StringValue) value).f248003b)) {
                    arrayList.add(obj3);
                }
            }
        } else if (value instanceof RatingFormField.ValueType.LongArrayValue) {
            arrayList = new ArrayList();
            for (Object obj4 : listU) {
                RatingFormField.Value value3 = (RatingFormField.Value) obj4;
                ArrayList arrayList3 = ((RatingFormField.ValueType.LongArrayValue) value).f248000b;
                ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(String.valueOf(((Number) it2.next()).longValue()));
                }
                if (arrayList4.contains(value3.getValue())) {
                    arrayList.add(obj4);
                }
            }
        } else {
            if (!(value instanceof RatingFormField.ValueType.StringArrayValue)) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList = new ArrayList();
            for (Object obj5 : listU) {
                if (((RatingFormField.ValueType.StringArrayValue) value).f248002b.contains(((RatingFormField.Value) obj5).getValue())) {
                    arrayList.add(obj5);
                }
            }
        }
        return arrayList;
    }

    public static String c(RatingFormField ratingFormField) {
        Object next;
        String label;
        RatingFormField.ValueType value = ratingFormField.getValue();
        if (value == null) {
            return "";
        }
        if (value instanceof RatingFormField.ValueType.StringValue) {
            return ((RatingFormField.ValueType.StringValue) value).f248003b;
        }
        List<RatingFormField.Value> listU = ratingFormField.u();
        if (listU == null) {
            listU = C42784z0.f406748b;
        }
        boolean z12 = value instanceof RatingFormField.ValueType.LongValue;
        if (z12 && !listU.isEmpty()) {
            Iterator<T> it = listU.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((RatingFormField.Value) next).getValue(), String.valueOf(((RatingFormField.ValueType.LongValue) value).f248001b))) {
                    break;
                }
            }
            RatingFormField.Value value2 = (RatingFormField.Value) next;
            return (value2 == null || (label = value2.getLabel()) == null) ? "" : label;
        }
        if (z12 && listU.isEmpty()) {
            return String.valueOf(((RatingFormField.ValueType.LongValue) value).f248001b);
        }
        if (!(value instanceof RatingFormField.ValueType.IntArrayValue)) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU) {
            RatingFormField.Value value3 = (RatingFormField.Value) obj;
            Iterable iterable = (Iterable) ((RatingFormField.ValueType.IntArrayValue) value).f247999b;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(String.valueOf(((Number) it2.next()).intValue()));
            }
            if (arrayList2.contains(value3.getValue())) {
                arrayList.add(obj);
            }
        }
        return C42745f0.O(arrayList, null, null, null, c.f248146l, 31);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ab  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.l java.lang.String r26, @Y61.k java.util.List r27, @Y61.l java.util.Map r28, @Y61.l java.lang.Boolean r29, @Y61.l java.lang.String r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.i.a(java.lang.String, java.util.List, java.util.Map, java.lang.Boolean, java.lang.String, boolean):java.util.ArrayList");
    }
}
