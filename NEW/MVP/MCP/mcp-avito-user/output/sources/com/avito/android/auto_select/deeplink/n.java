package com.avito.android.auto_select.deeplink;

import Hr.InterfaceC14024a;
import Ju.AbstractC14250d;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.auto_select.contact_me.AutoSelectContactMeBottomSheetResult;
import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeBottomSheetOpenArguments;
import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeContact;
import com.avito.android.deep_linking.links.AutoSelectContactMeLink;
import com.avito.android.deep_linking.links.AutoSelectContactMeType;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.auto_select.AutoSelectContactMeModel;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import rv.C47919b;

/* compiled from: AutoSelectContactMeLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_select/deeplink/n;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/deep_linking/links/AutoSelectContactMeLink;", "a", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n extends com.avito.android.deeplink_handler.handler.base.coroutines.a<AutoSelectContactMeLink> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f96059k = 0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.d f96060g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.f f96061h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f96062i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14024a f96063j;

    /* compiled from: AutoSelectContactMeLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/auto_select/deeplink/n$a;", "", "<init>", "()V", "", "ADVERT_ID_ARG", "Ljava/lang/String;", "CONTENT_BAG_CONTACT_ME_ID_ARG", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutoSelectContactMeLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96064a;

        static {
            int[] iArr = new int[AutoSelectContactMeType.values().length];
            try {
                iArr[AutoSelectContactMeType.Phone.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AutoSelectContactMeType.Messenger.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f96064a = iArr;
        }
    }

    /* compiled from: AutoSelectContactMeLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends C42801a implements Y41.p<C47919b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            n nVar = (n) this.receiver;
            int i12 = n.f96059k;
            nVar.getClass();
            AutoSelectContactMeBottomSheetResult.a aVar = AutoSelectContactMeBottomSheetResult.f95951N1;
            Bundle bundle = c47919b.f437159b;
            aVar.getClass();
            AutoSelectContactMeBottomSheetResult autoSelectContactMeBottomSheetResult = (AutoSelectContactMeBottomSheetResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("auto_select_contact_me_link.AutoSelectContactMeBottomSheetResult", AutoSelectContactMeBottomSheetResult.class) : bundle.getParcelable("auto_select_contact_me_link.AutoSelectContactMeBottomSheetResult"));
            if (autoSelectContactMeBottomSheetResult instanceof AutoSelectContactMeBottomSheetResult.NextLink) {
                nVar.i(AutoSelectContactMeLink.b.a.f133035b, nVar.f96062i, ((AutoSelectContactMeBottomSheetResult.NextLink) autoSelectContactMeBottomSheetResult).f95953b);
            } else if (autoSelectContactMeBottomSheetResult instanceof AutoSelectContactMeBottomSheetResult.Cancel) {
                nVar.j(AbstractC14250d.c.f9171c);
            } else {
                if (autoSelectContactMeBottomSheetResult != null) {
                    throw new NoWhenBranchMatchedException();
                }
                nVar.j(AbstractC14250d.b.f9170c);
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public n(@Y61.k a.d dVar, @Y61.k a.f fVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC14024a interfaceC14024a, @Y61.k R0 r02) {
        super(r02);
        this.f96060g = dVar;
        this.f96061h = fVar;
        this.f96062i = aVar;
        this.f96063j = interfaceC14024a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        String string;
        AutoSelectContactMeBottomSheetOpenArguments autoSelectContactMeBottomSheetOpenArguments;
        AutoSelectContactMeLink autoSelectContactMeLink = (AutoSelectContactMeLink) deepLink;
        if (bundle == null || (string = bundle.getString("advert_id_arg")) == null) {
            return G0.f406611a;
        }
        Object objB = this.f96063j.b(Boxing.boxLong(bundle.getLong("content_bag_contact_me_id_arg")));
        AutoSelectContactMeModel autoSelectContactMeModel = objB instanceof AutoSelectContactMeModel ? (AutoSelectContactMeModel) objB : null;
        if (autoSelectContactMeModel == null) {
            j(AbstractC14250d.b.f9170c);
            return G0.f406611a;
        }
        int i12 = b.f96064a[autoSelectContactMeLink.f133034b.ordinal()];
        if (i12 == 1) {
            AutoSelectContactMeModel.ContactModel phone = autoSelectContactMeModel.getPhone();
            String str2 = this.f395444b;
            String title = phone.getTitle();
            List<AutoSelectContactMeModel.Contact> contacts = phone.getContacts();
            ArrayList arrayList = new ArrayList(C42745f0.q(contacts, 10));
            for (AutoSelectContactMeModel.Contact contact : contacts) {
                arrayList.add(new AutoSelectContactMeContact(contact.getTitle(), contact.getDescription(), contact.getColor(), contact.getImage(), contact.getUri(), contact.isActive(), contact.getNeedsLogItemCall()));
            }
            autoSelectContactMeBottomSheetOpenArguments = new AutoSelectContactMeBottomSheetOpenArguments(str2, string, title, arrayList);
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            AutoSelectContactMeModel.ContactModel messenger = autoSelectContactMeModel.getMessenger();
            String str3 = this.f395444b;
            String title2 = messenger.getTitle();
            List<AutoSelectContactMeModel.Contact> contacts2 = messenger.getContacts();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(contacts2, 10));
            for (AutoSelectContactMeModel.Contact contact2 : contacts2) {
                arrayList2.add(new AutoSelectContactMeContact(contact2.getTitle(), contact2.getDescription(), contact2.getColor(), contact2.getImage(), contact2.getUri(), contact2.isActive(), contact2.getNeedsLogItemCall()));
            }
            autoSelectContactMeBottomSheetOpenArguments = new AutoSelectContactMeBottomSheetOpenArguments(str3, string, title2, arrayList2);
        }
        this.f96060g.D0(this.f395444b, new o(autoSelectContactMeBottomSheetOpenArguments));
        return G0.f406611a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @Y61.l
    public final Object n(@Y61.k Continuation<? super G0> continuation) {
        C43175k.K(new C43197r1(new c(2, this, n.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/FragmentResult;)V", 4), y.a(this.f96061h.l1(this.f395444b))), this.f134492f);
        return G0.f406611a;
    }
}
