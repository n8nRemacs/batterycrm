package defpackage;

import one.me.android.deeplink.LinkInterceptorWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class u78 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkInterceptorWidget b;

    public /* synthetic */ u78(LinkInterceptorWidget linkInterceptorWidget, int i) {
        this.a = i;
        this.b = linkInterceptorWidget;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        LinkInterceptorWidget linkInterceptorWidget = this.b;
        switch (i) {
            case 0:
                int i2 = LinkInterceptorWidget.d;
                return new kj1(new bwf(new u78(linkInterceptorWidget, 1)), new s2i(linkInterceptorWidget, 0));
            default:
                int i3 = LinkInterceptorWidget.d;
                return linkInterceptorWidget.getRouter();
        }
    }
}
