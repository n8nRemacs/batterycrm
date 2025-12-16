package FK0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.model.text.AttributedText;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AttributedText f4680c;

    public /* synthetic */ b(int i12, AttributedText attributedText) {
        this.f4679b = i12;
        this.f4680c = attributedText;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        AttributedText attributedText = this.f4680c;
        switch (this.f4679b) {
            case 0:
                w onDeepLinkClickListener = attributedText.getOnDeepLinkClickListener();
                if (onDeepLinkClickListener != null) {
                    onDeepLinkClickListener.i7(deepLink);
                    break;
                }
                break;
            case 1:
                w onDeepLinkClickListener2 = attributedText.getOnDeepLinkClickListener();
                if (onDeepLinkClickListener2 != null) {
                    onDeepLinkClickListener2.i7(deepLink);
                    break;
                }
                break;
            default:
                int i12 = com.avito.android.util.text.attribute_formatter.tooltip.b.f319066a;
                w onDeepLinkClickListener3 = attributedText.getOnDeepLinkClickListener();
                if (onDeepLinkClickListener3 != null) {
                    onDeepLinkClickListener3.i7(deepLink);
                    break;
                }
                break;
        }
    }
}
