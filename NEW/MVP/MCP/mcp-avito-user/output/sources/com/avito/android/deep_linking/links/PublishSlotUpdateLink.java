package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: PublishSlotUpdateLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/PublishSlotUpdateLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class PublishSlotUpdateLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PublishSlotUpdateLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, Map<String, Object>> f133627b;

    /* compiled from: PublishSlotUpdateLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PublishSlotUpdateLink> {
        @Override // android.os.Parcelable.Creator
        public final PublishSlotUpdateLink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                String string = parcel.readString();
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                int iC2 = 0;
                while (iC2 != i14) {
                    iC2 = org.webrtc.h.c(PublishSlotUpdateLink.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap.put(string, linkedHashMap2);
            }
            return new PublishSlotUpdateLink(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final PublishSlotUpdateLink[] newArray(int i12) {
            return new PublishSlotUpdateLink[i12];
        }
    }

    /* compiled from: PublishSlotUpdateLink.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/PublishSlotUpdateLink$b;", "LJu/c$b;", "<init>", "()V", "a", "Lcom/avito/android/deep_linking/links/PublishSlotUpdateLink$b$a;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: PublishSlotUpdateLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/PublishSlotUpdateLink$b$a;", "Lcom/avito/android/deep_linking/links/PublishSlotUpdateLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133628b = new a();

            public a() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PublishSlotUpdateLink(@Y61.k Map<String, ? extends Map<String, ? extends Object>> map) {
        this.f133627b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f133627b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            Iterator itI2 = C0.i(parcel, (Map) entry.getValue());
            while (itI2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itI2.next();
                org.webrtc.h.h(parcel, (String) entry2.getKey(), entry2);
            }
        }
    }
}
