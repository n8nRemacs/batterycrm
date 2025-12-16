package com.avito.android.advert.item.spare_parts.data;

import Ol0.e;
import Ol0.f;
import Ol0.g;
import Pl0.h;
import Pl0.j;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.spare_parts.data.CarCompatibility;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.spare_parts.generated.api.get_part_compatibilities_api_v_3.Car;
import com.avito.android.remote.spare_parts.generated.api.get_part_compatibilities_api_v_4.Car;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SparePartsMappers.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/data/b;", "", "<init>", "()V", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f80451a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final CarCompatibility.Car.Status f80452b = CarCompatibility.Car.Status.f80419e;

    /* compiled from: SparePartsMappers.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/data/b$a;", "", "<init>", "()V", "", "DEFAULT_SHOW_TITLE_IMAGE", "Z", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SparePartsMappers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.spare_parts.data.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C2380b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80453a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f80454b;

        static {
            int[] iArr = new int[Car.Status.values().length];
            try {
                iArr[Car.Status.Compatible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Car.Status.Unknown.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Car.Status.NoData.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f80453a = iArr;
            int[] iArr2 = new int[Car.Status.values().length];
            try {
                iArr2[Car.Status.Compatible.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Car.Status.Unknown.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Car.Status.NoData.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f80454b = iArr2;
        }
    }

    public static ArrayList a(List list) {
        List<e> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (e eVar : list2) {
            g image = eVar.getImage();
            ArrayList arrayList2 = null;
            Image value = image != null ? image.getValue() : null;
            g image2 = eVar.getImage();
            UniversalImage universalImageUniversalImageOf = UniversalImageKt.universalImageOf(value, image2 != null ? image2.getValueDark() : null);
            String groupTitle = eVar.getGroupTitle();
            String text = eVar.getText();
            String buttonText = eVar.getButtonText();
            Boolean isButtonDisabled = eVar.getIsButtonDisabled();
            boolean zBooleanValue = isButtonDisabled != null ? isButtonDisabled.booleanValue() : false;
            List<e> listC = eVar.c();
            ArrayList arrayListA = listC != null ? a(listC) : null;
            List<f> listE = eVar.e();
            if (listE != null) {
                List<f> list3 = listE;
                arrayList2 = new ArrayList(C42745f0.q(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new SparePartsSpecification(((f) it.next()).a()));
                }
            }
            arrayList.add(new SparePartsGroup(universalImageUniversalImageOf, groupTitle, text, buttonText, zBooleanValue, arrayListA, arrayList2));
        }
        return arrayList;
    }

    public static ArrayList b(List list) {
        List<Pl0.g> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (Pl0.g gVar : list2) {
            j image = gVar.getImage();
            ArrayList arrayList2 = null;
            Image value = image != null ? image.getValue() : null;
            j image2 = gVar.getImage();
            UniversalImage universalImageUniversalImageOf = UniversalImageKt.universalImageOf(value, image2 != null ? image2.getValueDark() : null);
            String groupTitle = gVar.getGroupTitle();
            String text = gVar.getText();
            String buttonText = gVar.getButtonText();
            Boolean isButtonDisabled = gVar.getIsButtonDisabled();
            boolean zBooleanValue = isButtonDisabled != null ? isButtonDisabled.booleanValue() : false;
            List<Pl0.g> listC = gVar.c();
            ArrayList arrayListB = listC != null ? b(listC) : null;
            List<h> listE = gVar.e();
            if (listE != null) {
                List<h> list3 = listE;
                arrayList2 = new ArrayList(C42745f0.q(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new SparePartsSpecification(((h) it.next()).a()));
                }
            }
            arrayList.add(new SparePartsGroup(universalImageUniversalImageOf, groupTitle, text, buttonText, zBooleanValue, arrayListB, arrayList2));
        }
        return arrayList;
    }
}
