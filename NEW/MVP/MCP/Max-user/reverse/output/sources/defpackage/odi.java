package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class odi implements pqa {
    public static final /* synthetic */ odi b = new odi(0);
    public static final /* synthetic */ odi c = new odi(1);
    public final /* synthetic */ int a;

    public /* synthetic */ odi(int i) {
        this.a = i;
    }

    @Override // defpackage.ie5
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                qqa qqaVar = (qqa) obj2;
                qqaVar.a(qdi.g, entry.getKey());
                qqaVar.a(qdi.h, entry.getValue());
                return;
            case 1:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                qqa qqaVar2 = (qqa) obj2;
                qqaVar2.a(hmi.g, entry2.getKey());
                qqaVar2.a(hmi.h, entry2.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
