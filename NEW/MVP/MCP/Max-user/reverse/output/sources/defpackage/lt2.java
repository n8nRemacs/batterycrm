package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes2.dex */
public final class lt2 implements CameraVideoCapturer.CameraEventsHandler {
    public final y6d a;

    public /* synthetic */ lt2(y6d y6dVar) {
        this.a = y6dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [id5] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap] */
    public static vi1 a(ti1 ti1Var, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        ?? map;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("participantState");
        vi1 vi1Var = new vi1(ti1Var);
        HashMap map2 = vi1Var.a;
        if (jSONObjectOptJSONObject2 == null) {
            map2.put("hand", new ui1("0", 0L));
            return vi1Var;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("state");
        if (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("stateUpdateTs")) == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
        if (itKeys.hasNext()) {
            map = new HashMap(jSONObjectOptJSONObject3.length());
            do {
                String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject3.optString(next));
            } while (itKeys.hasNext());
        } else {
            map = id5.a;
        }
        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
        if (itKeys2.hasNext()) {
            do {
                String next2 = itKeys2.next();
                String str = (String) map.get(next2);
                if (str != null) {
                    map2.put(next2, new ui1(str, jSONObjectOptJSONObject.optLong(next2)));
                }
            } while (itKeys2.hasNext());
        }
        return vi1Var;
    }

    public List b(JSONArray jSONArray) throws JSONException {
        vi1 vi1VarA;
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                vi1VarA = a(ti1.a(jSONObject.getString("id")), jSONObject);
            } catch (JSONException e) {
                this.a.logException("ParticipantStateParser", "Can't parse one state with index=" + i + " from participantList=" + jSONArray, e);
                vi1VarA = null;
            }
            arrayList.add(vi1VarA);
        }
        return ue3.E(arrayList);
    }

    public List c(JSONObject jSONObject) {
        try {
            return b(jSONObject.getJSONArray("participants"));
        } catch (JSONException e) {
            this.a.logException("ParticipantStateParser", "Can't parse state from participantList " + jSONObject, e);
            return hd5.a;
        }
    }

    public vi1 d(JSONObject jSONObject) {
        try {
            ti1 ti1VarV = paj.v(jSONObject);
            if (ti1VarV.a == 0) {
                ti1VarV = paj.w(jSONObject);
            }
            return a(ti1VarV, jSONObject);
        } catch (JSONException e) {
            this.a.logException("ParticipantStateParser", "Can't parse state from " + jSONObject, e);
            return null;
        }
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraClosed() {
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraDisconnected() {
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraError(String str, Throwable th) {
        this.a.reportException("OKRTCSvcFactory", "onCameraError(): " + str, new RuntimeException(wy1.h("Camera error: ", str), th));
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraFreezed(String str) {
        a9h.o("onCameraFreezed(): ", str, this.a, "OKRTCSvcFactory");
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraOpening(String str) {
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onFirstFrameAvailable() {
    }
}
