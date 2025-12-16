package ru.ok.android.externcalls.sdk.api;

import defpackage.ox7;
import defpackage.ti1;
import defpackage.xx7;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

/* loaded from: classes2.dex */
public class ExternalIdsResponse {
    public static final ox7 INSTANCE = new ox7() { // from class: ru.ok.android.externcalls.sdk.api.ExternalIdsResponse.1
        private void parseIds(Map<ti1, ParticipantId> map, xx7 xx7Var, boolean z) throws JsonTypeMismatchException, IOException {
            xx7Var.p();
            while (xx7Var.hasNext()) {
                String strName = xx7Var.name();
                try {
                    map.put(ti1.a(strName), ParticipantId.withoutDeviceId(xx7Var.B(), z));
                } catch (NumberFormatException unused) {
                    GlobalRTCLogger.log(ExternalIdsResponse.LOG_TAG, "got not parsable internal id '" + strName + "'");
                }
            }
            xx7Var.n();
        }

        @Override // defpackage.ox7
        public ExternalIdsResponse parse(xx7 xx7Var) throws JsonParseException, IOException {
            HashMap map = new HashMap();
            xx7Var.p();
            while (xx7Var.hasNext()) {
                String strName = xx7Var.name();
                strName.getClass();
                if (strName.equals("external_ids")) {
                    parseIds(map, xx7Var, false);
                } else if (strName.equals("anonym_ids")) {
                    parseIds(map, xx7Var, true);
                } else {
                    xx7Var.v();
                }
            }
            xx7Var.n();
            return new ExternalIdsResponse(map);
        }
    };
    private static final String LOG_TAG = "ExternalIdsResponse";
    private final Map<ti1, ParticipantId> internalToExternal;

    public ExternalIdsResponse(Map<ti1, ParticipantId> map) {
        this.internalToExternal = map;
    }

    public Map<ti1, ParticipantId> getMapping() {
        return this.internalToExternal;
    }
}
