package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class mw7 implements pqa {
    public final /* synthetic */ int a;

    @Override // defpackage.ie5
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                qqa qqaVar = (qqa) obj2;
                qqaVar.a(cpc.g, entry.getKey());
                qqaVar.a(cpc.h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
