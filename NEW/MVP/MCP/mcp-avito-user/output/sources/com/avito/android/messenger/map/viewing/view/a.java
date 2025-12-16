package com.avito.android.messenger.map.viewing.view;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.clustering.AbstractClusterItem;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: Pin.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/viewing/view/a;", "Lcom/avito/android/avito_map/clustering/AbstractClusterItem;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractClusterItem {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f196860a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<CharSequence> f196861b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f196862c;

    public /* synthetic */ a(String str, AvitoMapPoint avitoMapPoint, String str2, List list, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? UUID.randomUUID().toString() : str, avitoMapPoint, str2, list, z12);
    }

    public static a a(a aVar, boolean z12) {
        String str = aVar.f196860a;
        AvitoMapPoint position = aVar.getPosition();
        String title = aVar.getTitle();
        List<CharSequence> list = aVar.f196861b;
        aVar.getClass();
        return new a(str, position, title, list, z12);
    }

    @Override // com.avito.android.avito_map.clustering.AbstractClusterItem
    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a) || !super.equals(obj)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f196860a, aVar.f196860a) && this.f196862c == aVar.f196862c;
    }

    @Override // com.avito.android.avito_map.clustering.AbstractClusterItem
    public final int hashCode() {
        return Boolean.hashCode(this.f196862c) + H.d(super.hashCode() * 31, 31, this.f196860a);
    }

    @Override // com.avito.android.avito_map.clustering.AbstractClusterItem
    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Pin(\n\t id=");
        sb2.append(this.f196860a);
        sb2.append(",\n\t position=");
        sb2.append(getPosition());
        sb2.append(",\n\t title=");
        sb2.append(getTitle());
        sb2.append(",\n\t snippet=");
        sb2.append(getSnippet());
        sb2.append(",\n\t isSelected=");
        return r.s("\n)", sb2, this.f196862c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k String str, @k AvitoMapPoint avitoMapPoint, @k String str2, @k List<? extends CharSequence> list, boolean z12) {
        String string;
        if (!list.isEmpty()) {
            StringBuilder sb2 = new StringBuilder((list.size() * 2) - 1);
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 >= 0) {
                    sb2.append((CharSequence) obj);
                    if (i12 < list.size() - 1) {
                        sb2.append("\n");
                    }
                    i12 = i13;
                } else {
                    C42745f0.H0();
                    throw null;
                }
            }
            string = sb2.toString();
        } else {
            string = "";
        }
        super(avitoMapPoint, str2, string);
        this.f196860a = str;
        this.f196861b = list;
        this.f196862c = z12;
    }
}
