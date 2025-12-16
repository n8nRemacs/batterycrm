package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* loaded from: classes.dex */
public abstract class l6j {
    public static py0 b(byte[] bArr) throws ProtoException {
        byte[] bArr2 = a.a;
        try {
            Protos.SelfProfile from = Protos.SelfProfile.parseFrom(bArr);
            HashMap map = new HashMap();
            Map<Integer, Protos.RestrictionsInfo> map2 = from.restrictions;
            if (map2 != null && !map2.isEmpty()) {
                for (Integer num : from.restrictions.keySet()) {
                    map.put(num, new epd(from.restrictions.get(num).expiration));
                }
            }
            ArrayList arrayList = new ArrayList();
            int[] iArr = from.profileOptions;
            if (iArr != null && iArr.length >= 1) {
                int i = 0;
                while (true) {
                    int[] iArr2 = from.profileOptions;
                    if (i >= iArr2.length) {
                        break;
                    }
                    arrayList.add(Integer.valueOf(iArr2[i]));
                    i++;
                }
            }
            return new py0(map, 29, arrayList);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }

    public abstract void a(gte gteVar, float f, float f2);
}
