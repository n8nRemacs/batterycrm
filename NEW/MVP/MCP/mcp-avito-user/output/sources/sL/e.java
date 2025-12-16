package SL;

import Ku.AbstractC14350a;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink;
import com.avito.android.remote.model.Image;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: IacMakeCallLinkParser.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"LSL/e;", "LKu/a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink;", "<init>", "()V", "a", "b", "c", "d", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends AbstractC14350a<IacMakeCallLink> {

    /* compiled from: IacMakeCallLinkParser.kt */
    @P
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BM\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"LSL/e$a;", "", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "scenario", "", "isVideo", "analyticsInfo", "LSL/e$c;", "caller", "LSL/e$b;", "callee", "LSL/e$d;", "item", "searchContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;LSL/e$c;LSL/e$b;LSL/e$d;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "e", "Z", "g", "()Z", "getAnalyticsInfo", "LSL/e$c;", "c", "()LSL/e$c;", "LSL/e$b;", "b", "()LSL/e$b;", "LSL/e$d;", "d", "()LSL/e$d;", "f", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        @com.google.gson.annotations.c("analyticsInfo")
        @Y61.k
        private final String analyticsInfo;

        @com.google.gson.annotations.c(FailedBinderCallBack.CALLER_ID)
        @Y61.k
        private final String callId;

        @com.google.gson.annotations.c("callee")
        @Y61.k
        private final b callee;

        @com.google.gson.annotations.c("caller")
        @Y61.k
        private final c caller;

        @com.google.gson.annotations.c("isVideo")
        private final boolean isVideo;

        @com.google.gson.annotations.c("item")
        @Y61.k
        private final d item;

        @com.google.gson.annotations.c("scenario")
        @Y61.k
        private final String scenario;

        @com.google.gson.annotations.c("searchContext")
        @l
        private final String searchContext;

        public a(@Y61.k String str, @Y61.k String str2, boolean z12, @Y61.k String str3, @Y61.k c cVar, @Y61.k b bVar, @Y61.k d dVar, @l String str4) {
            this.callId = str;
            this.scenario = str2;
            this.isVideo = z12;
            this.analyticsInfo = str3;
            this.caller = cVar;
            this.callee = bVar;
            this.item = dVar;
            this.searchContext = str4;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final b getCallee() {
            return this.callee;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final c getCaller() {
            return this.caller;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final d getItem() {
            return this.item;
        }

        @Y61.k
        /* renamed from: e, reason: from getter */
        public final String getScenario() {
            return this.scenario;
        }

        @l
        /* renamed from: f, reason: from getter */
        public final String getSearchContext() {
            return this.searchContext;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getIsVideo() {
            return this.isVideo;
        }
    }

    /* compiled from: IacMakeCallLinkParser.kt */
    @P
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LSL/e$b;", "", "", "id", "name", "Lcom/avito/android/remote/model/Image;", "imagePack", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("imagePack")
        @Y61.k
        private final Image imagePack;

        @com.google.gson.annotations.c("name")
        @l
        private final String name;

        public b(@Y61.k String str, @l String str2, @Y61.k Image image) {
            this.id = str;
            this.name = str2;
            this.imagePack = image;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final Image getImagePack() {
            return this.imagePack;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }
    }

    /* compiled from: IacMakeCallLinkParser.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LSL/e$c;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        public c(@Y61.k String str) {
            this.id = str;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: IacMakeCallLinkParser.kt */
    @P
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LSL/e$d;", "", "", "id", "ownerId", "title", "price", "Lcom/avito/android/remote/model/Image;", "imagePack", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "e", "d", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("imagePack")
        @Y61.k
        private final Image imagePack;

        @com.google.gson.annotations.c("ownerId")
        @Y61.k
        private final String ownerId;

        @com.google.gson.annotations.c("price")
        @Y61.k
        private final String price;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public d(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k Image image) {
            this.id = str;
            this.ownerId = str2;
            this.title = str3;
            this.price = str4;
            this.imagePack = image;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final Image getImagePack() {
            return this.imagePack;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getOwnerId() {
            return this.ownerId;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @Y61.k
        /* renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // Ku.AbstractC14350a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.deep_linking.links.DeepLink r(android.net.Uri r27, com.google.gson.Gson r28, com.avito.android.deep_linking.x r29) throws com.avito.android.deep_linking.links.error.DeeplinkParsingError.WrongParameterValue {
        /*
            r26 = this;
            java.lang.String r0 = "callInputJson"
            r1 = r27
            java.lang.String r0 = Ku.i.n(r1, r0)
            SL.f r1 = new SL.f
            r1.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L25
            r2 = r1
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            boolean r3 = com.avito.android.util.R1.a(r2)
            if (r3 == 0) goto L25
            java.lang.reflect.Type r1 = r2.getRawType()
        L22:
            r2 = r28
            goto L2a
        L25:
            java.lang.reflect.Type r1 = com.avito.android.util.R1.b(r1)
            goto L22
        L2a:
            java.lang.Object r0 = r2.e(r0, r1)
            SL.e$a r0 = (SL.e.a) r0
            com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink r1 = new com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink
            com.avito.android.iac_dialer_models.abstract_module.IacCallInfo r15 = new com.avito.android.iac_dialer_models.abstract_module.IacCallInfo
            java.lang.String r3 = r0.getCallId()
            com.avito.android.iac_dialer_models.abstract_module.IacPeerInfo r10 = new com.avito.android.iac_dialer_models.abstract_module.IacPeerInfo
            SL.e$b r2 = r0.getCallee()
            java.lang.String r6 = r2.getId()
            SL.e$b r2 = r0.getCallee()
            java.lang.String r7 = r2.getName()
            SL.e$b r2 = r0.getCallee()
            com.avito.android.remote.model.Image r5 = r2.getImagePack()
            kotlin.collections.z0 r9 = kotlin.collections.C42784z0.f406748b
            java.lang.String r8 = ""
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            com.avito.android.iac_dialer_models.abstract_module.IacItemInfo r5 = new com.avito.android.iac_dialer_models.abstract_module.IacItemInfo
            SL.e$d r2 = r0.getItem()
            java.lang.String r17 = r2.getId()
            SL.e$d r2 = r0.getItem()
            java.lang.String r18 = r2.getOwnerId()
            SL.e$d r2 = r0.getItem()
            java.lang.String r19 = r2.getTitle()
            SL.e$d r2 = r0.getItem()
            java.lang.String r20 = r2.getPrice()
            SL.e$d r2 = r0.getItem()
            com.avito.android.remote.model.Image r21 = r2.getImagePack()
            r22 = 0
            r23 = 32
            r24 = 0
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            SL.e$c r2 = r0.getCaller()
            java.lang.String r6 = r2.getId()
            java.lang.String r7 = r0.getScenario()
            boolean r8 = r0.getIsVideo()
            com.avito.android.iac_dialer_models.abstract_module.IacCallDirection r9 = com.avito.android.iac_dialer_models.abstract_module.IacCallDirection.OUTGOING
            java.lang.String r14 = r0.getSearchContext()
            r11 = 0
            r0 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r2 = r15
            r10 = r12
            r12 = r13
            r13 = r16
            r25 = r15
            r15 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r25
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: SL.e.r(android.net.Uri, com.google.gson.Gson, com.avito.android.deep_linking.x):com.avito.android.deep_linking.links.DeepLink");
    }
}
