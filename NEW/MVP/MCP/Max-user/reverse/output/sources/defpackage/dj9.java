package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public abstract class dj9 {
    public static final /* synthetic */ int a = 0;

    public static ArrayList a(Protos.MessageElement[] messageElementArr) {
        bj9 bj9Var;
        bj9 bj9Var2;
        ArrayList arrayList = new ArrayList();
        for (Protos.MessageElement messageElement : messageElementArr) {
            int i = messageElement.type;
            Map mapSingletonMap = null;
            switch (i) {
                case 0:
                    bj9Var = bj9.a;
                    bj9Var2 = bj9Var;
                    break;
                case 1:
                    bj9Var = bj9.b;
                    bj9Var2 = bj9Var;
                    break;
                case 2:
                    bj9Var = bj9.d;
                    bj9Var2 = bj9Var;
                    break;
                case 3:
                    bj9Var = bj9.c;
                    bj9Var2 = bj9Var;
                    break;
                case 4:
                    bj9Var = bj9.o;
                    bj9Var2 = bj9Var;
                    break;
                case 5:
                    bj9Var = bj9.X;
                    bj9Var2 = bj9Var;
                    break;
                case 6:
                    bj9Var = bj9.Y;
                    bj9Var2 = bj9Var;
                    break;
                case 7:
                    bj9Var = bj9.s0;
                    bj9Var2 = bj9Var;
                    break;
                case 8:
                    bj9Var = bj9.t0;
                    bj9Var2 = bj9Var;
                    break;
                case 9:
                    bj9Var = bj9.Z;
                    bj9Var2 = bj9Var;
                    break;
                case 10:
                    bj9Var = bj9.u0;
                    bj9Var2 = bj9Var;
                    break;
                case 11:
                    bj9Var = bj9.v0;
                    bj9Var2 = bj9Var;
                    break;
                default:
                    Locale locale = Locale.ENGLISH;
                    wqi.e("dj9", "Unknown protoElement type = " + i, null);
                    bj9Var2 = null;
                    break;
            }
            long j = messageElement.entityId;
            String str = l8g.c(messageElement.entityName) ? null : messageElement.entityName;
            int i2 = messageElement.from;
            int i3 = messageElement.length;
            Protos.MessageElement.LinkAttributes linkAttributes = messageElement.linkAttributes;
            if (linkAttributes != null) {
                mapSingletonMap = Collections.singletonMap(KwsFeaturesConfigProviderImpl.URL_KEY, linkAttributes.url);
            }
            arrayList.add(new cj9(j, str, bj9Var2, i2, i3, mapSingletonMap));
        }
        return arrayList;
    }

    public static byte[] b(List list) {
        return fl9.toByteArray(c(list));
    }

    public static Protos.MessageElements c(List list) {
        Protos.MessageElements messageElements = new Protos.MessageElements();
        messageElements.elements = new Protos.MessageElement[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cj9 cj9Var = (cj9) list.get(i);
            Protos.MessageElement messageElement = new Protos.MessageElement();
            long j = cj9Var.a;
            Map map = cj9Var.f;
            messageElement.entityId = j;
            String str = cj9Var.b;
            byte[] bArr = a.a;
            if (str == null) {
                str = "";
            }
            messageElement.entityName = str;
            messageElement.from = cj9Var.d;
            messageElement.length = cj9Var.e;
            switch (cj9Var.c.ordinal()) {
                case 0:
                    messageElement.type = 0;
                    break;
                case 1:
                    messageElement.type = 1;
                    break;
                case 2:
                    messageElement.type = 3;
                    break;
                case 3:
                    messageElement.type = 2;
                    break;
                case 4:
                    messageElement.type = 4;
                    break;
                case 5:
                    messageElement.type = 5;
                    if (!map.containsKey(KwsFeaturesConfigProviderImpl.URL_KEY)) {
                        throw new IllegalStateException("There are not enough attributes for the type = LINK");
                    }
                    Protos.MessageElement.LinkAttributes linkAttributes = new Protos.MessageElement.LinkAttributes();
                    messageElement.linkAttributes = linkAttributes;
                    linkAttributes.url = (String) map.get(KwsFeaturesConfigProviderImpl.URL_KEY);
                    break;
                case 6:
                    messageElement.type = 6;
                    break;
                case 7:
                    messageElement.type = 9;
                    break;
                case 8:
                    messageElement.type = 7;
                    break;
                case 9:
                    messageElement.type = 8;
                    break;
                case 10:
                    messageElement.type = 10;
                    break;
                case 11:
                    messageElement.type = 11;
                    break;
            }
            messageElements.elements[i] = messageElement;
        }
        return messageElements;
    }
}
