package com.avito.android.publish.slots.information_with_user_id;

import Y61.l;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.k;
import com.avito.android.deep_linking.K;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.information.InformationSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.information.InformationWithUserIdSlot;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.BadgeAttribute;
import com.avito.android.remote.model.text.DateAttribute;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.remote.model.text.UnknownAttribute;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.g;

/* compiled from: InformationWithUserIdSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/slots/information_with_user_id/a;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/information/InformationWithUserIdSlot;", "Lcom/avito/android/deep_linking/K;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends k<InformationWithUserIdSlot> implements K, q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InformationWithUserIdSlot f244321b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f244322c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<f> f244323d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final m f244324e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public AttributedText f244325f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f244326g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f244327h;

    /* compiled from: InformationWithUserIdSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Profile;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/Profile;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.information_with_user_id.a$a, reason: collision with other inner class name */
    public static final class C7318a<T> implements g {
        public C7318a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Parcelable parcelableCopy$default;
            a aVar = a.this;
            AttributedText text = ((InformationSlotConfig) aVar.f244321b.getWidget().getConfig()).getText();
            String userId = ((Profile) obj).getUserId();
            if (userId == null) {
                userId = "";
            }
            ArrayList arrayList = new ArrayList();
            for (Attribute attribute : text.getAttributes()) {
                String strA0 = C43066x.a0(attribute.getTitle(), "{{userID}}", userId, false);
                if (attribute instanceof FontAttribute) {
                    parcelableCopy$default = FontAttribute.copy$default((FontAttribute) attribute, null, strA0, null, 5, null);
                } else if (attribute instanceof LinkAttribute) {
                    parcelableCopy$default = LinkAttribute.copy$default((LinkAttribute) attribute, null, strA0, null, null, 13, null);
                } else if (attribute instanceof DeepLinkAttribute) {
                    parcelableCopy$default = DeepLinkAttribute.copy$default((DeepLinkAttribute) attribute, null, strA0, null, null, null, null, 61, null);
                } else if (attribute instanceof UnknownAttribute) {
                    parcelableCopy$default = UnknownAttribute.copy$default((UnknownAttribute) attribute, null, strA0, null, 5, null);
                } else if (attribute instanceof DateAttribute) {
                    parcelableCopy$default = DateAttribute.copy$default((DateAttribute) attribute, null, strA0, null, null, null, 29, null);
                } else {
                    if (!(attribute instanceof BadgeAttribute)) {
                        throw new UnsupportedOperationException(attribute.getName());
                    }
                    parcelableCopy$default = BadgeAttribute.copy$default((BadgeAttribute) attribute, null, strA0, null, 5, null);
                }
                arrayList.add(parcelableCopy$default);
            }
            aVar.f244325f = new AttributedText(text.getText(), arrayList, 0, 4, null);
            aVar.f244323d.accept(new f.b(SlotType.INFORMATION_WITH_USER_ID, null));
        }
    }

    /* compiled from: InformationWithUserIdSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f244329b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    @i31.c
    public a(@InterfaceC41220a @Y61.k InformationWithUserIdSlot informationWithUserIdSlot, @Y61.k com.avito.android.publish.P p12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f244321b = informationWithUserIdSlot;
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f244322c = cVar;
        com.jakewharton.rxrelay3.c<f> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f244323d = cVar2;
        ((InformationSlotConfig) informationWithUserIdSlot.getWidget().getConfig()).getText().setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 14));
        this.f244324e = (m) p12.a().z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new C7318a(), b.f244329b);
        this.f244326g = cVar;
        this.f244327h = cVar2;
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<f> a() {
        return this.f244327h;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        m mVar = this.f244324e;
        mVar.getClass();
        DisposableHelper.a(mVar);
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244321b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        AttributedText attributedText = this.f244325f;
        return attributedText != null ? Collections.singletonList(new com.avito.android.publish.slots.information_with_user_id.item.c(f(), attributedText)) : C42784z0.f406748b;
    }

    @Override // com.avito.android.deep_linking.K
    @Y61.k
    public final z<DeepLink> k() {
        return this.f244326g;
    }
}
