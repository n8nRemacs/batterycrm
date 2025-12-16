package com.yandex.div.core.view2.errors;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.json.ParsingException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C42833p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ErrorView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class m extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f369085l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar) {
        super(0);
        this.f369085l = nVar;
    }

    @Override // Y41.a
    public final G0 invoke() throws JSONException {
        n nVar = this.f369085l;
        if (nVar.f369090f != null) {
            i iVar = nVar.f369087c;
            iVar.getClass();
            JSONObject jSONObject = new JSONObject();
            ArrayList arrayList = iVar.f369076c;
            if (arrayList.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Throwable th2 = (Throwable) it.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("message", q.a(th2));
                    jSONObject2.put("stacktrace", C42833p.b(th2));
                    if (th2 instanceof ParsingException) {
                        ParsingException parsingException = (ParsingException) th2;
                        jSONObject2.put("reason", parsingException.f370541b);
                        com.yandex.div.internal.util.g gVar = parsingException.f370542c;
                        jSONObject2.put("json_source", gVar == null ? null : gVar.a());
                        jSONObject2.put("json_summary", parsingException.f370543d);
                    }
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("errors", jSONArray);
            }
            ArrayList arrayList2 = iVar.f369077d;
            if (arrayList2.size() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Throwable th3 = (Throwable) it2.next();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("warning_message", th3.getMessage());
                    jSONObject3.put("stacktrace", C42833p.b(th3));
                    jSONArray2.put(jSONObject3);
                }
                jSONObject.put("warnings", jSONArray2);
            }
            String string = jSONObject.toString(4);
            C38029k c38029k = nVar.f369086b;
            Object systemService = c38029k.getContext().getSystemService("clipboard");
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(new ClipData("Error report", new String[]{"text/plain"}, new ClipData.Item(string)));
                Toast.makeText(c38029k.getContext(), "Error details are at your clipboard!", 0).show();
            }
        }
        return G0.f406611a;
    }
}
