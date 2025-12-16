package Jd;

import Y61.k;
import com.avito.android.deep_linking.links.DialogDeepLink;
import com.avito.android.remote.model.DialogInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: Utils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_async-phone-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {
    @k
    public static final DialogDeepLink a(@k DialogInfo dialogInfo) {
        Object obj;
        Object next;
        String text;
        String text2;
        DialogDeepLink.ControlsDirection controlsDirection = L.f(dialogInfo.getControlsDirection(), "vertical") ? DialogDeepLink.ControlsDirection.f133265c : DialogDeepLink.ControlsDirection.f133264b;
        Iterator<T> it = dialogInfo.getContent().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((DialogInfo.Content) next).getStyle(), "heading")) {
                break;
            }
        }
        DialogInfo.Content content = (DialogInfo.Content) next;
        Iterator<T> it2 = dialogInfo.getContent().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (L.f(((DialogInfo.Content) next2).getStyle(), "body")) {
                obj = next2;
                break;
            }
        }
        DialogInfo.Content content2 = (DialogInfo.Content) obj;
        boolean isCancellable = dialogInfo.getIsCancellable();
        boolean shouldShowCloseControl = dialogInfo.getShouldShowCloseControl();
        String str = "";
        String str2 = (content == null || (text2 = content.getText()) == null) ? "" : text2;
        if (content2 != null && (text = content2.getText()) != null) {
            str = text;
        }
        List<DialogInfo.Control> controls = dialogInfo.getControls();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : controls) {
            if (L.f(((DialogInfo.Control) obj2).getType(), "button")) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            DialogInfo.Control control = (DialogInfo.Control) it3.next();
            String style = control.getStyle();
            arrayList2.add(new DialogDeepLink.DialogButton(control.getAction(), control.getTitle(), L.f(style, "primary") ? DialogDeepLink.DialogButtonStyle.PRIMARY : L.f(style, "danger") ? DialogDeepLink.DialogButtonStyle.DANGER : DialogDeepLink.DialogButtonStyle.SECONDARY));
        }
        return new DialogDeepLink(controlsDirection, isCancellable, shouldShowCloseControl, str, arrayList2, str2, null, null, null, null, 512, null);
    }
}
