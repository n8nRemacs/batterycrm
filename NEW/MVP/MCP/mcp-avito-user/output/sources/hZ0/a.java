package HZ0;

import com.google.gson.JsonIOException;
import java.lang.reflect.Field;

/* compiled from: ReflectionHelper.java */
/* loaded from: classes6.dex */
public class a {
    public static void a(Field field) throws SecurityException {
        try {
            field.setAccessible(true);
        } catch (Exception e12) {
            throw new JsonIOException("Failed making field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "' accessible; either change its visibility or write a custom TypeAdapter for its declaring type", e12);
        }
    }
}
