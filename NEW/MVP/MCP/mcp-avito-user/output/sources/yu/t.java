package Yu;

import Ku.AbstractC14350a;
import com.avito.android.deep_linking.links.ToastMessageLink;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ToastLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LYu/t;", "LKu/a;", "Lcom/avito/android/deep_linking/links/ToastMessageLink;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class t extends AbstractC14350a<ToastMessageLink> {

    /* compiled from: ToastLinkParser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ToastMessageLink.ToastTheme> f19727a = kotlin.enums.c.a(ToastMessageLink.ToastTheme.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    @Override // Ku.AbstractC14350a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.deep_linking.links.DeepLink r(android.net.Uri r9, com.google.gson.Gson r10, com.avito.android.deep_linking.x r11) throws com.avito.android.deep_linking.links.error.DeeplinkParsingError.WrongParameterValue {
        /*
            r8 = this;
            java.lang.String r10 = "message"
            java.lang.String r1 = Ku.i.o(r9, r10)
            java.lang.String r10 = "type"
            java.lang.String r10 = r9.getQueryParameter(r10)
            r0 = 0
            r2 = 0
            if (r10 == 0) goto L2c
            com.avito.android.deep_linking.links.ToastMessageLink$ToastType[] r3 = com.avito.android.deep_linking.links.ToastMessageLink.ToastType.values()
            int r4 = r3.length
            r5 = r0
        L16:
            if (r5 >= r4) goto L26
            r6 = r3[r5]
            java.lang.String r7 = r6.f133739b
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L23
            goto L27
        L23:
            int r5 = r5 + 1
            goto L16
        L26:
            r6 = r2
        L27:
            if (r6 != 0) goto L2a
            goto L2c
        L2a:
            r10 = r6
            goto L2e
        L2c:
            com.avito.android.deep_linking.links.ToastMessageLink$ToastType r10 = com.avito.android.deep_linking.links.ToastMessageLink.ToastType.f133734c
        L2e:
            java.lang.String r3 = "toastBarPosition"
            java.lang.String r3 = r9.getQueryParameter(r3)
            if (r3 == 0) goto L4e
            com.avito.android.deep_linking.links.ToastMessageLink$ToastBarPosition[] r4 = com.avito.android.deep_linking.links.ToastMessageLink.ToastBarPosition.values()
            int r5 = r4.length
        L3b:
            if (r0 >= r5) goto L4b
            r6 = r4[r0]
            java.lang.String r7 = r6.f133729b
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L48
            goto L4c
        L48:
            int r0 = r0 + 1
            goto L3b
        L4b:
            r6 = r2
        L4c:
            r3 = r6
            goto L4f
        L4e:
            r3 = r2
        L4f:
            java.lang.String r0 = "buttonTitle"
            java.lang.String r4 = r9.getQueryParameter(r0)
            java.lang.String r0 = "buttonDeepLink"
            java.lang.String r0 = r9.getQueryParameter(r0)
            if (r0 == 0) goto L63
            com.avito.android.deep_linking.links.DeepLink r11 = r11.b(r0)
            r5 = r11
            goto L64
        L63:
            r5 = r2
        L64:
            java.lang.String r11 = "closeOnAction"
            java.lang.String r11 = r9.getQueryParameter(r11)
            boolean r6 = java.lang.Boolean.parseBoolean(r11)
            java.lang.String r11 = "theme"
            java.lang.String r9 = r9.getQueryParameter(r11)
            if (r9 == 0) goto L96
            kotlin.enums.a<com.avito.android.deep_linking.links.ToastMessageLink$ToastTheme> r11 = Yu.t.a.f19727a
            kotlin.collections.c r11 = (kotlin.collections.AbstractC42738c) r11
            java.util.Iterator r11 = r11.iterator()
        L7e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r11.next()
            r7 = r0
            com.avito.android.deep_linking.links.ToastMessageLink$ToastTheme r7 = (com.avito.android.deep_linking.links.ToastMessageLink.ToastTheme) r7
            java.lang.String r7 = r7.f133733b
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L7e
            r2 = r0
        L94:
            com.avito.android.deep_linking.links.ToastMessageLink$ToastTheme r2 = (com.avito.android.deep_linking.links.ToastMessageLink.ToastTheme) r2
        L96:
            r7 = r2
            com.avito.android.deep_linking.links.ToastMessageLink r9 = new com.avito.android.deep_linking.links.ToastMessageLink
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Yu.t.r(android.net.Uri, com.google.gson.Gson, com.avito.android.deep_linking.x):com.avito.android.deep_linking.links.DeepLink");
    }
}
