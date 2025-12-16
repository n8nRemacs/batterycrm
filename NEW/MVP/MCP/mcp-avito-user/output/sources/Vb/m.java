package Vb;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.SendButtonMode;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AiAssistantState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/m;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f17266a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f17267b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17268c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SendButtonMode f17269d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17270e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final AttributedText f17271f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.android.ai_assistant.adapter.a> f17272g;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@Y61.k j jVar, @Y61.l String str, boolean z12, @Y61.k SendButtonMode sendButtonMode, boolean z13, @Y61.l AttributedText attributedText, @Y61.k List<? extends com.avito.android.ai_assistant.adapter.a> list) {
        this.f17266a = jVar;
        this.f17267b = str;
        this.f17268c = z12;
        this.f17269d = sendButtonMode;
        this.f17270e = z13;
        this.f17271f = attributedText;
        this.f17272g = list;
    }

    public static m a(m mVar, j jVar, String str, boolean z12, boolean z13, AttributedText attributedText, List list, int i12) {
        SendButtonMode sendButtonMode = SendButtonMode.f89287b;
        j jVar2 = (i12 & 1) != 0 ? mVar.f17266a : jVar;
        String str2 = (i12 & 2) != 0 ? mVar.f17267b : str;
        boolean z14 = (i12 & 4) != 0 ? mVar.f17268c : z12;
        if ((i12 & 8) != 0) {
            sendButtonMode = mVar.f17269d;
        }
        boolean z15 = (i12 & 16) != 0 ? mVar.f17270e : z13;
        AttributedText attributedText2 = (i12 & 32) != 0 ? mVar.f17271f : attributedText;
        List list2 = (i12 & 64) != 0 ? mVar.f17272g : list;
        mVar.getClass();
        return new m(jVar2, str2, z14, sendButtonMode, z15, attributedText2, list2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f17266a, mVar.f17266a) && L.f(this.f17267b, mVar.f17267b) && this.f17268c == mVar.f17268c && this.f17269d == mVar.f17269d && this.f17270e == mVar.f17270e && L.f(this.f17271f, mVar.f17271f) && L.f(this.f17272g, mVar.f17272g);
    }

    public final int hashCode() {
        int iHashCode = this.f17266a.hashCode() * 31;
        String str = this.f17267b;
        int i12 = r.i((this.f17269d.hashCode() + r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f17268c)) * 31, 31, this.f17270e);
        AttributedText attributedText = this.f17271f;
        return this.f17272g.hashCode() + ((i12 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ViewState(contentState=");
        sb2.append(this.f17266a);
        sb2.append(", userQuery=");
        sb2.append(this.f17267b);
        sb2.append(", sendButtonVisible=");
        sb2.append(this.f17268c);
        sb2.append(", sendButtonMode=");
        sb2.append(this.f17269d);
        sb2.append(", sendEnabled=");
        sb2.append(this.f17270e);
        sb2.append(", disclaimerText=");
        sb2.append(this.f17271f);
        sb2.append(", itemsList=");
        return H.p(sb2, this.f17272g, ')');
    }
}
