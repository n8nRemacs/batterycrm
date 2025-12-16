package defpackage;

import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes.dex */
public abstract class knb {
    public static final zi1 a(ParticipantId participantId) {
        Integer numH;
        List listS = vmf.S(participantId.id, new String[]{":"}, 6);
        int iIntValue = 0;
        if (listS.size() > 1 && (numH = cnf.h((String) listS.get(1))) != null) {
            iIntValue = numH.intValue();
        }
        return new zi1(Long.parseLong((String) ue3.G(listS)), iIntValue);
    }

    public static final ParticipantId b(long j) {
        return ParticipantId.authorized(String.valueOf(j));
    }

    public static final ParticipantId c(zi1 zi1Var) {
        return new ParticipantId(String.valueOf(zi1Var.a), false, zi1Var.b);
    }
}
