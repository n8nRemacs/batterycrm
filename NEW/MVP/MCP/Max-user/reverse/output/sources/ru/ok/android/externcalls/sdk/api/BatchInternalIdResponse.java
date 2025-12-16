package ru.ok.android.externcalls.sdk.api;

import defpackage.ox7;
import defpackage.ti1;
import defpackage.uy0;
import defpackage.xx7;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes2.dex */
public class BatchInternalIdResponse {
    public static final ox7 PARSER = new uy0(18);
    public final Map<ParticipantId, ti1> externalToInternalIdsMap;

    public BatchInternalIdResponse(Map<ParticipantId, ti1> map) {
        this.externalToInternalIdsMap = map;
    }

    public static BatchInternalIdResponse parse(xx7 xx7Var) throws JsonTypeMismatchException, IOException, NumberFormatException {
        HashMap map = new HashMap();
        xx7Var.p();
        while (xx7Var.hasNext()) {
            if (xx7Var.name().equals("ids")) {
                readIdsArray(xx7Var, map);
            } else {
                xx7Var.v();
            }
        }
        xx7Var.n();
        return new BatchInternalIdResponse(map);
    }

    private static ParticipantId readExternalId(xx7 xx7Var) throws JsonTypeMismatchException, IOException {
        xx7Var.p();
        String strB = null;
        Boolean boolValueOf = null;
        while (xx7Var.hasNext()) {
            String strName = xx7Var.name();
            strName.getClass();
            if (strName.equals("id")) {
                strB = xx7Var.B();
            } else if (strName.equals("ok_anonym")) {
                boolValueOf = Boolean.valueOf(xx7Var.W());
            } else {
                xx7Var.v();
            }
        }
        xx7Var.n();
        if (strB == null || boolValueOf == null) {
            return null;
        }
        return ParticipantId.withoutDeviceId(strB, boolValueOf.booleanValue());
    }

    private static void readIdMapping(xx7 xx7Var, Map<ParticipantId, ti1> map) throws JsonTypeMismatchException, IOException, NumberFormatException {
        xx7Var.p();
        ti1 ti1VarA = null;
        ParticipantId externalId = null;
        while (xx7Var.hasNext()) {
            String strName = xx7Var.name();
            strName.getClass();
            if (strName.equals("external_user_id")) {
                externalId = readExternalId(xx7Var);
            } else if (strName.equals("ok_user_id")) {
                ti1VarA = ti1.a(xx7Var.B());
            } else {
                xx7Var.v();
            }
        }
        xx7Var.n();
        if (ti1VarA == null || externalId == null) {
            return;
        }
        map.put(externalId, ti1VarA);
    }

    private static void readIdsArray(xx7 xx7Var, Map<ParticipantId, ti1> map) throws JsonTypeMismatchException, IOException, NumberFormatException {
        xx7Var.r();
        while (xx7Var.hasNext()) {
            readIdMapping(xx7Var, map);
        }
        xx7Var.q();
    }
}
