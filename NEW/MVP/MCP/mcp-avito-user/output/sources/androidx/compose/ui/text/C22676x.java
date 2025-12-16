package androidx.compose.ui.text;

import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import kotlin.Metadata;
import org.xml.sax.XMLReader;

/* compiled from: Html.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22676x {

    /* compiled from: Html.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/text/x$a", "Landroid/text/Html$TagHandler;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.x$a */
    public static final class a implements Html.TagHandler {
        @Override // android.text.Html.TagHandler
        public final void handleTag(boolean z12, String str, Editable editable, XMLReader xMLReader) {
            if (xMLReader == null || editable == null || !z12 || !kotlin.jvm.internal.L.f(str, "ContentHandlerReplacementTag")) {
                return;
            }
            xMLReader.setContentHandler(new C22663m(xMLReader.getContentHandler(), editable));
        }
    }

    /* compiled from: Html.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.x$b */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        new a();
    }
}
